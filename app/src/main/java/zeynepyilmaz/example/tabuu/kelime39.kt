package zeynepyilmaz.example.tabuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime26Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime38Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime39Binding

class kelime39 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime39)
        val binding= ActivityKelime39Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button391.setOnClickListener{
            intent= Intent(applicationContext,takimlar::class.java)
            startActivity(intent)
            finish()}
        binding.button392.setOnClickListener{
            intent= Intent(applicationContext,takimlar::class.java)
            startActivity(intent)
            finish()}
        binding.button393.setOnClickListener{
            intent= Intent(applicationContext,takimlar::class.java)
            startActivity(intent)
            finish()}
    }
}