package com.example.homework_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_5.databinding.ActivityRegister2Binding

class Register2 : AppCompatActivity() {
    private lateinit var binding: ActivityRegister2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegister2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView2.setOnClickListener{
            val backIntent = Intent(this,Register::class.java)
            startActivity(backIntent)
        }

        binding.userBtn.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent )
        }
    }
}