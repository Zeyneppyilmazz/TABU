package zeynepyilmaz.example.tabuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import zeynepyilmaz.example.tabuu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var auth: FirebaseAuth
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate((layoutInflater))

        setContentView(binding.root)
        auth= FirebaseAuth.getInstance()
        //kullanıcının oturum açıp açmadığını kontrol edelim
         var currentUser=auth.currentUser
        if(currentUser!=null){
            startActivity(Intent(this@MainActivity,GirisActivity2::class.java))
            finish()
        }
        //giris yap butonuna tıklandığında
        binding.girisbutton.setOnClickListener{
            var girisemail=binding.girisTextEmailAddress.text.toString()
            var girisparola=binding.girisTextPassword.text.toString()
            if(TextUtils.isEmpty(girisemail)){
                binding.girisTextEmailAddress.error="Lütfen e-mail adresinizi yazın"
                return@setOnClickListener
            }
            else if(TextUtils.isEmpty(girisparola)){
                binding.girisTextPassword.error="Lütfen parolanızı girin"
                return@setOnClickListener

        }
         //Giris bilgilerimizi doğrulayıp giriş yapıyoruz
         auth.signInWithEmailAndPassword(girisemail,girisparola)
             .addOnCompleteListener(this){
                 if(it.isSuccessful){
                     intent=Intent(applicationContext,ilkekran::class.java)
                     startActivity(intent)
                     finish()
                 }
                 else{
                     Toast.makeText(applicationContext,"Giriş hatalı,lütfen tekrar deneyiniz"
                     ,Toast.LENGTH_LONG).show()
                 }
             }
    }
        //yeni üyelik sayfasına gitmek için
        binding.textView3.setOnClickListener{
            intent=Intent(applicationContext,Uyeactivity::class.java)
            startActivity(intent)
            finish()

        }
        //parolamı unuttum sayfasına gitmek için
        binding.textView2.setOnClickListener{
            intent=Intent(applicationContext,Parolasifirla::class.java)
            startActivity(intent)
            finish()

        }



    }}