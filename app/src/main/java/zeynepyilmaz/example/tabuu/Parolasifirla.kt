package zeynepyilmaz.example.tabuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import zeynepyilmaz.example.tabuu.databinding.ActivityParolasifirlaBinding

class  Parolasifirla : AppCompatActivity() {
    lateinit var binding: ActivityParolasifirlaBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =ActivityParolasifirlaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth=FirebaseAuth.getInstance()
        //e mailin boş olup olmadığını kontrol ettiricez

        binding.prflsifirlamabutton.setOnClickListener{
            var psifirlaemail=binding.prflsifirlamaTextEmailAddress.text.toString().trim()
            //trim,eğer e-mailin başında veya sonunda boşluk varsa hata vermesin diye düzeltir.
            if(TextUtils.isEmpty(psifirlaemail)){
                binding.prflsifirlamaTextEmailAddress.error="Lütfen e-mail adresinizi yazınız"
            }else{
                //kullanıcı e-mailini yazdıysa burdan itibaren sıfırlama işlemini yapar
              auth.sendPasswordResetEmail(psifirlaemail)
                  .addOnCompleteListener(this){sifirlama->
                      if(sifirlama.isSuccessful){
                          binding.prflsifirlamatextView2.text="E-mail adresinize sıfırlama bağlantısı gönderildi,kontrol ediniz."

                      }else{binding.prflsifirlamatextView2.text="Sıfırlama işlemi başarısız."

                      }
                  }
            }

        }//giriş sayfasına gitmek için
        binding.prflsifirlamagirisbutton.setOnClickListener{
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            finish()


    }

}}