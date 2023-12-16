package zeynepyilmaz.example.tabuu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import zeynepyilmaz.example.tabuu.databinding.ActivityGuncelleBinding

class Guncelle : AppCompatActivity() {
    lateinit var binding: ActivityGuncelleBinding
    private lateinit var auth: FirebaseAuth
    var databaseReference: DatabaseReference?=null
    var database: FirebaseDatabase?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityGuncelleBinding.inflate(layoutInflater)

        setContentView(binding.root)

        auth= FirebaseAuth.getInstance()
        //konumu belirliyoruz
        database=FirebaseDatabase.getInstance()
        databaseReference=database?.reference!!.child("profile")
        var currentUser=auth.currentUser
        binding.gNcelleTextEmailAddress.setText(currentUser?.email)
        //realtime-database de bulunan kullanıcın id sine erişip adını soyadını alalım
        var userReference=databaseReference?.child(currentUser?.uid!!)
        userReference?.addValueEventListener(object :ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
               binding.gNcelleadtextView.setText(snapshot.child("adisoyadi").value.toString())

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
        //bilgilerimi güncelle button
        binding.gNcellebilgibutton.setOnClickListener{
            var guncelleemail=binding.gNcelleTextEmailAddress.text.toString().trim()
            currentUser!!.updateEmail(guncelleemail)
                .addOnCompleteListener{task->
                    if(task.isSuccessful){
                        Toast.makeText(applicationContext,"E-mail güncellendi",
                            Toast.LENGTH_LONG).show()
                        }else{
                        Toast.makeText(applicationContext,"E-mail başarısız",
                            Toast.LENGTH_LONG).show()

                    }
                }
            //parola güncelleme
            var guncelleparola=binding.gNcelleTextPassword.text.toString().trim()
            currentUser!!.updatePassword(guncelleparola)
                .addOnCompleteListener{task->
                    if(task.isSuccessful){
                        Toast.makeText(applicationContext,"Parola güncellendi",
                            Toast.LENGTH_LONG).show()
                    }else{
                        Toast.makeText(applicationContext,"Parola başarısız",
                            Toast.LENGTH_LONG).show()

                    }
                }
            //ad soyad güncelleme
            var currentUserDb=currentUser?.let{it1->databaseReference?.child((it1.uid))
            }
            currentUserDb?.removeValue()//id kaldırmış olucak

            currentUserDb?.child("adisoyadi")?.setValue(binding.gNcelleadtextView.text.toString())
            Toast.makeText(applicationContext,"Adı Soyadı güncellendi",
                Toast.LENGTH_LONG).show()

        }

    }
}

private fun FirebaseUser.updateEmail() {
    TODO("Not yet implemented")
}
