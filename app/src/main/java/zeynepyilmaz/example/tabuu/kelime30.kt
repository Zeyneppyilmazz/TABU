package zeynepyilmaz.example.tabuu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import zeynepyilmaz.example.tabuu.databinding.ActivityKelime30Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityTakimlarBinding


class kelime30 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime30)
        val binding= ActivityKelime30Binding.inflate((layoutInflater))
        setContentView(binding.root)



        binding.button301.setOnClickListener{
            intent= Intent(applicationContext,kelime31::class.java)
            startActivity(intent)
            finish()}
        binding.button302.setOnClickListener{
            intent= Intent(applicationContext,kelime31::class.java)
            startActivity(intent)
            finish()}
        binding.button303.setOnClickListener{
            intent= Intent(applicationContext,kelime31::class.java)
            startActivity(intent)
            finish()}
    }
}