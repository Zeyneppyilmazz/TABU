package zeynepyilmaz.example.tabuu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime26Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime32Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime33Binding

class kelime33 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime33)

        val binding= ActivityKelime33Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button331.setOnClickListener{
            intent= Intent(applicationContext,kelime34::class.java)
            startActivity(intent)
            finish()}
        binding.button332.setOnClickListener{
            intent= Intent(applicationContext,kelime34::class.java)
            startActivity(intent)
            finish()}
        binding.button333.setOnClickListener{
            intent= Intent(applicationContext,kelime34::class.java)
            startActivity(intent)
            finish()}
    }
}