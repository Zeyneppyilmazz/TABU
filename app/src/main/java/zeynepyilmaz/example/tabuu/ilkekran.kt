package zeynepyilmaz.example.tabuu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import zeynepyilmaz.example.tabuu.databinding.ActivityIlkekranBinding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime2Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityMainBinding

class ilkekran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ilkekran)
        var binding = ActivityIlkekranBinding.inflate(layoutInflater)
        var sayfam=binding.root
        setContentView(sayfam)
        binding.button5.setOnClickListener{
            intent=Intent(applicationContext,takimlar::class.java)
            startActivity(intent)
            finish()}
    }

}