package zeynepyilmaz.example.tabuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime26Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime33Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime34Binding

class kelime34 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime34)
        val binding= ActivityKelime34Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button341.setOnClickListener{
            intent= Intent(applicationContext,kelime35::class.java)
            startActivity(intent)
            finish()}
        binding.button342.setOnClickListener{
            intent= Intent(applicationContext,kelime35::class.java)
            startActivity(intent)
            finish()}
        binding.button343.setOnClickListener{
            intent= Intent(applicationContext,kelime35::class.java)
            startActivity(intent)
            finish()}
    }
}