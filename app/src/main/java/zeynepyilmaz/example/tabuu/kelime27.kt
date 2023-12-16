package zeynepyilmaz.example.tabuu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime26Binding

import zeynepyilmaz.example.tabuu.databinding.ActivityKelime27Binding


class kelime27 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime27)
        val binding= ActivityKelime27Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button271.setOnClickListener{
            intent= Intent(applicationContext,kelime28::class.java)
            startActivity(intent)
            finish()}
        binding.button272.setOnClickListener{
            intent= Intent(applicationContext,kelime28::class.java)
            startActivity(intent)
            finish()}
        binding.button273.setOnClickListener{
            intent= Intent(applicationContext,kelime28::class.java)
            startActivity(intent)
            finish()}
    }
}