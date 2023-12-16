package zeynepyilmaz.example.tabuu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime26Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime27Binding

import zeynepyilmaz.example.tabuu.databinding.ActivityKelime28Binding

class kelime28 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime28)
        val binding= ActivityKelime28Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button281.setOnClickListener{
            intent= Intent(applicationContext,kelime29::class.java)
            startActivity(intent)
            finish()}
        binding.button282.setOnClickListener{
            intent= Intent(applicationContext,kelime29::class.java)
            startActivity(intent)
            finish()}
        binding.button283.setOnClickListener{
            intent= Intent(applicationContext,kelime29::class.java)
            startActivity(intent)
            finish()}
    }
}