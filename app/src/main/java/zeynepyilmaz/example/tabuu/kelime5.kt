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
import zeynepyilmaz.example.tabuu.databinding.ActivityMainBinding
class kelime5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime5)
        var binding = ActivityKelime5Binding.inflate(layoutInflater)
        var sayfam=binding.root
        setContentView(sayfam)
        binding.button51.setOnClickListener{
            intent=Intent(applicationContext,kelime6::class.java)
            startActivity(intent)
            finish()}
        binding.button52.setOnClickListener{
            intent=Intent(applicationContext,kelime6::class.java)
            startActivity(intent)
            finish()}
        binding.button53.setOnClickListener{
            intent=Intent(applicationContext,kelime6::class.java)
            startActivity(intent)
            finish()}
    }
}