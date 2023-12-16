package zeynepyilmaz.example.tabuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import zeynepyilmaz.example.tabuu.databinding.ActivityGiris2Binding

class GirisActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityGiris2Binding
    private lateinit var auth: FirebaseAuth
    var databaseReference: DatabaseReference?=null
    var database: FirebaseDatabase?=null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityGiris2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()
        //konumu belirliyoruz
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("profile")
        var currentUser = auth.currentUser
        binding.profiltext2.text = "Email:" + currentUser?.email
        //realtime-database deki id ye ulaşıp altındaki childların içindeki veriyi sayfaya aktarıcaz
        var userReference = databaseReference?.child(currentUser?.uid!!)
        userReference?.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                binding.profiltext3.text =
                    "Tam adınız: " + snapshot.child("adisoyadi").value.toString()
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
        //çıkış yap butonu
        binding.profilbutton2.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this@GirisActivity2, MainActivity::class.java))
            finish()


        }
        //hesabımı sil butonu
        binding.profilbutton3.setOnClickListener {
            currentUser?.delete()?.addOnCompleteListener {
                if (it.isSuccessful) {
                    Toast.makeText(
                        applicationContext, "hesabınız silindi",
                        Toast.LENGTH_LONG
                    ).show()
                    auth.signOut()
                    startActivity(Intent(this@GirisActivity2, MainActivity::class.java))
                    finish()
                    var currentUserDb = currentUser?.let { it1 ->
                        databaseReference?.child((it1.uid))
                    }
                    currentUserDb?.removeValue()//currentuser ın id sini gidip kaldır
                    Toast.makeText(
                        applicationContext, "AdiSoyadi Silindi.",
                        Toast.LENGTH_LONG
                    ).show()


                }
            }

        }
        //güncelle butonu
        binding.profilbutton.setOnClickListener {

            startActivity(Intent(this@GirisActivity2, Guncelle::class.java))
            finish()


        }
        binding.girisyapbtnnn.setOnClickListener {

            startActivity(Intent(this@GirisActivity2, ilkekran::class.java))
            finish()
        }
    }
}