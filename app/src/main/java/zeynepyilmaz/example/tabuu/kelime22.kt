package zeynepyilmaz.example.tabuu


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime21Binding
import zeynepyilmaz.example.tabuu.databinding.ActivityKelime22Binding

class kelime22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime22)
        val binding= ActivityKelime22Binding.inflate((layoutInflater))
        setContentView(binding.root)

        binding.button221.setOnClickListener{
            intent= Intent(applicationContext,kelime23::class.java)
            startActivity(intent)
            finish()}
        binding.button222.setOnClickListener{
            intent= Intent(applicationContext,kelime23::class.java)
            startActivity(intent)
            finish()}
        binding.button223.setOnClickListener{
            intent= Intent(applicationContext,kelime23::class.java)
            startActivity(intent)
            finish()}
    }
}