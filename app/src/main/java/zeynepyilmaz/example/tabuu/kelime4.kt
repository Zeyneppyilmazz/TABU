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
import zeynepyilmaz.example.tabuu.databinding.ActivityMainBinding
class kelime4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime4)
        var binding = ActivityKelime4Binding.inflate(layoutInflater)
        var sayfam=binding.root
        setContentView(sayfam)
        binding.button41.setOnClickListener{
            intent=Intent(applicationContext,kelime5::class.java)
            startActivity(intent)
            finish()}
        binding.button42.setOnClickListener{
            intent=Intent(applicationContext,kelime5::class.java)
            startActivity(intent)
            finish()}
        binding.button43.setOnClickListener{
            intent=Intent(applicationContext,kelime5::class.java)
            startActivity(intent)
            finish()}
    }
}