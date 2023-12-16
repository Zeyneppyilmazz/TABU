package zeynepyilmaz.example.tabuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime2Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime3Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime4Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime5Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime6Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime7Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime8Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime9Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityMainBinding

class kelime9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime9)
        var binding = ActivityKelime9Binding.inflate(layoutInflater)
        var sayfam=binding.root
        setContentView(sayfam)
        binding.button91.setOnClickListener{
            intent=Intent(applicationContext,kelime10::class.java)
            startActivity(intent)
            finish()}
        binding.button92.setOnClickListener{
            intent=Intent(applicationContext,kelime10::class.java)
            startActivity(intent)
            finish()}
        binding.button93.setOnClickListener{
            intent=Intent(applicationContext,kelime10::class.java)
            startActivity(intent)
            finish()}
    }
}