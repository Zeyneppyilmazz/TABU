package zeynepyilmaz.example.tabuu



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime26Binding

import zeynepyilmaz.example.tabuu.databinding.ActivityKelime31Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime32Binding

class kelime32 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime32)
        val binding= ActivityKelime32Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button321.setOnClickListener{
            intent= Intent(applicationContext,kelime33::class.java)
            startActivity(intent)
            finish()}
        binding.button322.setOnClickListener{
            intent= Intent(applicationContext,kelime33::class.java)
            startActivity(intent)
            finish()}
        binding.button323.setOnClickListener{
            intent= Intent(applicationContext,kelime33::class.java)
            startActivity(intent)
            finish()}
    }
}