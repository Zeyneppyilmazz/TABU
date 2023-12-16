package zeynepyilmaz.example.tabuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime26Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime34Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime35Binding

class kelime35 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime35)
        val binding= ActivityKelime35Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button351.setOnClickListener{
            intent= Intent(applicationContext,kelime36::class.java)
            startActivity(intent)
            finish()}
        binding.button352.setOnClickListener{
            intent= Intent(applicationContext,kelime36::class.java)
            startActivity(intent)
            finish()}
        binding.button353.setOnClickListener{
            intent= Intent(applicationContext,kelime36::class.java)
            startActivity(intent)
            finish()}
    }
}