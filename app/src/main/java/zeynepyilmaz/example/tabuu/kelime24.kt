package zeynepyilmaz.example.tabuu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime23Binding

import zeynepyilmaz.example.tabuu.databinding.ActivityKelime24Binding

class kelime24 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime24)
        val binding= ActivityKelime24Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button241.setOnClickListener{
            intent= Intent(applicationContext,kelime25::class.java)
            startActivity(intent)
            finish()}
        binding.button242.setOnClickListener{
            intent= Intent(applicationContext,kelime25::class.java)
            startActivity(intent)
            finish()}
        binding.button243.setOnClickListener{
            intent= Intent(applicationContext,kelime25::class.java)
            startActivity(intent)
            finish()}
    }
}