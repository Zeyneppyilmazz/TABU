package zeynepyilmaz.example.tabuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime26Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime36Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime37Binding

class kelime37 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime37)
        val binding= ActivityKelime37Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button371.setOnClickListener{
            intent= Intent(applicationContext,kelime38::class.java)
            startActivity(intent)
            finish()}
        binding.button372.setOnClickListener{
            intent= Intent(applicationContext,kelime38::class.java)
            startActivity(intent)
            finish()}
        binding.button373.setOnClickListener{
            intent= Intent(applicationContext,kelime38::class.java)
            startActivity(intent)
            finish()}
    }
}