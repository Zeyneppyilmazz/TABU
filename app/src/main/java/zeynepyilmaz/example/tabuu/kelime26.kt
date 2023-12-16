package zeynepyilmaz.example.tabuu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime25Binding

import zeynepyilmaz.example.tabuu.databinding.ActivityKelime26Binding

class kelime26 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime26)
        val binding= ActivityKelime26Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button261.setOnClickListener{
            intent= Intent(applicationContext,kelime27::class.java)
            startActivity(intent)
            finish()}
        binding.button262.setOnClickListener{
            intent= Intent(applicationContext,kelime27::class.java)
            startActivity(intent)
            finish()}
        binding.button263.setOnClickListener{
            intent= Intent(applicationContext,kelime27::class.java)
            startActivity(intent)
            finish()}
    }
}