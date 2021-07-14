package com.guresberat.mydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.guresberat.mydemo.customrecyclerview.CustomRecyclerViewActivity
import com.guresberat.mydemo.databinding.ActivityCustomRecyclerViewBinding
import com.guresberat.mydemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.let{
            it.startButton.setOnClickListener{
                Toast.makeText(this,"test",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,CustomRecyclerViewActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}