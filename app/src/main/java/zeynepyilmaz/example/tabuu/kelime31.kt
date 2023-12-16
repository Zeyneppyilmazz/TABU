package zeynepyilmaz.example.tabuu



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime26Binding

import zeynepyilmaz.example.tabuu.databinding.ActivityKelime31Binding

class kelime31 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime31)
        val binding= ActivityKelime31Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button311.setOnClickListener{
            intent= Intent(applicationContext,kelime32::class.java)
            startActivity(intent)
            finish()}
        binding.button312.setOnClickListener{
            intent= Intent(applicationContext,kelime32::class.java)
            startActivity(intent)
            finish()}
        binding.button313.setOnClickListener{
            intent= Intent(applicationContext,kelime32::class.java)
            startActivity(intent)
            finish()}
    }
}