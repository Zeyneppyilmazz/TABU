package zeynepyilmaz.example.tabuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime26Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime37Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime38Binding

class kelime38 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime38)
        val binding= ActivityKelime38Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button381.setOnClickListener{
            intent= Intent(applicationContext,kelime39::class.java)
            startActivity(intent)
            finish()}
        binding.button382.setOnClickListener{
            intent= Intent(applicationContext,kelime39::class.java)
            startActivity(intent)
            finish()}
        binding.button383.setOnClickListener{
            intent= Intent(applicationContext,kelime39::class.java)
            startActivity(intent)
            finish()}
    }
}