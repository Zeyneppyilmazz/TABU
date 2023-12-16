package zeynepyilmaz.example.tabuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import zeynepyilmaz.example.tabuu.databinding.ActivityUyeactivityBinding

class Uyeactivity : AppCompatActivity() {
    lateinit var binding: ActivityUyeactivityBinding

    private lateinit var auth: FirebaseAuth
    var databaseReference:DatabaseReference?=null
    var database:FirebaseDatabase?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =ActivityUyeactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth= FirebaseAuth.getInstance()
        //konumu belirliyoruz
        database=FirebaseDatabase.getInstance()
        databaseReference=database?.reference!!.child("profile")

        //Kaydet butonu ile kaydetme adımları
        binding.uyebutton2.setOnClickListener{
            var uyeadsoyad=binding.uyetextView.text.toString()
            var email= binding.uyeTextEmailAddress.text.toString()
            var parola=binding.uyeTextPassword.text.toString()

            if(TextUtils.isEmpty(uyeadsoyad)){
                binding.uyetextView.error="Lütfen adınızı ve soyadınızı giriniz"
                return@setOnClickListener
            }
            else if(TextUtils.isEmpty(email)){
                binding.uyeTextEmailAddress.error="Lütfen E-mailinizi giriniz"
                return@setOnClickListener
            }
            else if(TextUtils.isEmpty(parola)){
                binding.uyeTextPassword.error="Lütfen parolanızı giriniz"
            return@setOnClickListener
            }
            //burdan sonrası yeni eklendi
            else{
                var database=FirebaseDatabase.getInstance()
                var databaseReference=database.reference.child("Users")
                var id=databaseReference.push()

                id.child("id").setValue(id.key.toString())
                id.child("adısoyadı").setValue(uyeadsoyad)

            }
            //Email,parola ve kullanıcı bilgilerini veri tabanına ekleme
            auth.createUserWithEmailAndPassword(binding.uyeTextEmailAddress.text.toString(),binding.uyeTextPassword.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        //Şuanki kullanıcı bilgilerini alalım
                        var currentUser = auth.currentUser
                        //kullanıcı id sini alıp o id adı altında adımızı ve soyadımızı kaydedelim
                        var currentUserDb=currentUser?.let{it1->databaseReference?.child((it1.uid))
                        }
                        currentUserDb?.child("adisoyadi")?.setValue(binding.uyetextView.text.toString())
                        Toast.makeText(this@Uyeactivity,"KAYIT BAŞARILI",Toast.LENGTH_LONG).show()

                    }else{Toast.makeText(this@Uyeactivity,"KAYIT HATALI",Toast.LENGTH_LONG).show()


                    }
                }

        }
        //Giriş sayfasına gitmek için
        binding.uyeebutton.setOnClickListener {
            intent= Intent(applicationContext,GirisActivity2::class.java)
            startActivity((intent))
            finish()
        }}
}