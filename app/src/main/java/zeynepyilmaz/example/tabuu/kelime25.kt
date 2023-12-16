package zeynepyilmaz.example.tabuu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime24Binding

import zeynepyilmaz.example.tabuu.databinding.ActivityKelime25Binding


class kelime25 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime25)
        val binding= ActivityKelime25Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button251.setOnClickListener{
            intent= Intent(applicationContext,kelime26::class.java)
            startActivity(intent)
            finish()}
        binding.button252.setOnClickListener{
            intent= Intent(applicationContext,kelime26::class.java)
            startActivity(intent)
            finish()}
        binding.button253.setOnClickListener{
            intent= Intent(applicationContext,kelime26::class.java)
            startActivity(intent)
            finish()}
    }
}