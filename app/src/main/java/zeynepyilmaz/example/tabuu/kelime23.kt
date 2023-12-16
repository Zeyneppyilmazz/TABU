package zeynepyilmaz.example.tabuu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime22Binding

import zeynepyilmaz.example.tabuu.databinding.ActivityKelime23Binding

class kelime23 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime23)
        val binding= ActivityKelime23Binding.inflate((layoutInflater))
        setContentView(binding.root)


        binding.button231.setOnClickListener{
            intent= Intent(applicationContext,kelime24::class.java)
            startActivity(intent)
            finish()}
        binding.button232.setOnClickListener{
            intent= Intent(applicationContext,kelime24::class.java)
            startActivity(intent)
            finish()}
        binding.button233.setOnClickListener{
            intent= Intent(applicationContext,kelime24::class.java)
            startActivity(intent)
            finish()}
    }
}