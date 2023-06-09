package com.example.saveadriver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.saveadriver.databinding.ActivityMainBinding
import com.example.saveadriver.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signingup.setOnClickListener {
            val intent= Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }

        binding.loggingin.setOnClickListener {
            val intent= Intent(this,SigninActivity::class.java)
            startActivity(intent)
        }
    }
}