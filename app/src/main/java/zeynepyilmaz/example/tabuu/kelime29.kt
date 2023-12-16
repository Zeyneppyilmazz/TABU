package zeynepyilmaz.example.tabuu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime26Binding

import zeynepyilmaz.example.tabuu.databinding.ActivityKelime29Binding

class kelime29 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime29)
        val binding= ActivityKelime29Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button291.setOnClickListener{
            intent= Intent(applicationContext,takimlar::class.java)
            startActivity(intent)
            finish()}
        binding.button292.setOnClickListener{
            intent= Intent(applicationContext,takimlar::class.java)
            startActivity(intent)
            finish()}
        binding.button293.setOnClickListener{
            intent= Intent(applicationContext,takimlar::class.java)
            startActivity(intent)
            finish()}
    }
}