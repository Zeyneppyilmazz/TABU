package zeynepyilmaz.example.tabuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime26Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime35Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime36Binding

class kelime36 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime36)
        val binding= ActivityKelime36Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button361.setOnClickListener{
            intent= Intent(applicationContext,kelime37::class.java)
            startActivity(intent)
            finish()}
        binding.button362.setOnClickListener{
            intent= Intent(applicationContext,kelime37::class.java)
            startActivity(intent)
            finish()}
        binding.button363.setOnClickListener{
            intent= Intent(applicationContext,kelime37::class.java)
            startActivity(intent)
            finish()}
    }
}