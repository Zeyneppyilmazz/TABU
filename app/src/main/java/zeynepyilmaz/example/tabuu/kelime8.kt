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
import zeynepyilmaz.example.tabuu.databinding.ActivityMainBinding
class kelime8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime8)
        var binding = ActivityKelime8Binding.inflate(layoutInflater)
        var sayfam=binding.root
        setContentView(sayfam)
        binding.button81.setOnClickListener{
            intent=Intent(applicationContext,kelime9::class.java)
            startActivity(intent)
            finish()}
        binding.button82.setOnClickListener{
            intent=Intent(applicationContext,kelime9::class.java)
            startActivity(intent)
            finish()}
        binding.button83.setOnClickListener{
            intent=Intent(applicationContext,kelime9::class.java)
            startActivity(intent)
            finish()}
    }
}