package zeynepyilmaz.example.tabuu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime2Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityMainBinding

class kelime2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime2)
        var binding = ActivityKelime2Binding.inflate(layoutInflater)
        var sayfam=binding.root
        setContentView(sayfam)
        binding.button21.setOnClickListener{
            intent=Intent(applicationContext,kelime3::class.java)
            startActivity(intent)
            finish()}
        binding.button22.setOnClickListener{
            intent=Intent(applicationContext,kelime3::class.java)
            startActivity(intent)
            finish()}
        binding.button23.setOnClickListener{
            intent=Intent(applicationContext,kelime3::class.java)
            startActivity(intent)
            finish()}
    }
}