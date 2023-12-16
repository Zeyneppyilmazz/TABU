package zeynepyilmaz.example.tabuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime10Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime2Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime3Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime4Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime5Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime6Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime7Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime8Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime9Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityMainBinding

class kelime10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime10)
        var binding = ActivityKelime10Binding.inflate(layoutInflater)
        var sayfam=binding.root
        setContentView(sayfam)
        binding.button101.setOnClickListener{
            intent=Intent(applicationContext,kelime11::class.java)
            startActivity(intent)
            finish()}
        binding.button102.setOnClickListener{
            intent=Intent(applicationContext,kelime11::class.java)
            startActivity(intent)
            finish()}
        binding.button103.setOnClickListener{
            intent=Intent(applicationContext,kelime11::class.java)
            startActivity(intent)
            finish()}
    }
}