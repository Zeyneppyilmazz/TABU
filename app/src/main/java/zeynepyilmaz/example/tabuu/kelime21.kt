package zeynepyilmaz.example.tabuu

import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime21Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime30Binding

class kelime21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime21)
        val binding= ActivityKelime21Binding.inflate((layoutInflater))
        setContentView(binding.root)



        binding.button211.setOnClickListener{
            intent= Intent(applicationContext,kelime22::class.java)
            startActivity(intent)
            finish()}
        binding.button212.setOnClickListener{
            intent= Intent(applicationContext,kelime22::class.java)
            startActivity(intent)
            finish()}
        binding.button213.setOnClickListener{
            intent= Intent(applicationContext,kelime22::class.java)
            startActivity(intent)
            finish()}
    }
}