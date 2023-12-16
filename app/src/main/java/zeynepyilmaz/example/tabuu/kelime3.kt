package zeynepyilmaz.example.tabuu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime2Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime3Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityMainBinding

class kelime3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime3)
        var binding = ActivityKelime3Binding.inflate(layoutInflater)
        var sayfam=binding.root
        setContentView(sayfam)
        binding.button31.setOnClickListener{
            intent=Intent(applicationContext,kelime4::class.java)
            startActivity(intent)
            finish()}
        binding.button32.setOnClickListener{
            intent=Intent(applicationContext,kelime4::class.java)
            startActivity(intent)
            finish()}
        binding.button33.setOnClickListener{
            intent=Intent(applicationContext,kelime4::class.java)
            startActivity(intent)
            finish()}
    }
}