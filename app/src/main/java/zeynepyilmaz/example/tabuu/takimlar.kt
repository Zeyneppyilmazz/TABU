package zeynepyilmaz.example.tabuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import zeynepyilmaz.example.tabuu.databinding.ActivityMainBinding
import zeynepyilmaz.example.tabuu.databinding.ActivityTakimlarBinding

class takimlar : AppCompatActivity() {
    lateinit var binding: takimlar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityTakimlarBinding.inflate((layoutInflater))
        setContentView(binding.root)
        binding.takM1.setOnClickListener{
            intent=Intent(applicationContext,kelime2::class.java)
            startActivity(intent)
            finish()}
            binding.takM2.setOnClickListener{
                intent=Intent(applicationContext,kelime21::class.java)
                startActivity(intent)
                finish()}
                binding.takM3.setOnClickListener{
                    intent=Intent(applicationContext,kelime30::class.java)
                    startActivity(intent)
                    finish()}
    }
}