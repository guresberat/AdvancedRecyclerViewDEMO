package com.guresberat.mydemo.customrecyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.guresberat.mydemo.customrecyclerviewsingle.CustomSingleRecyclerViewActivity
import com.guresberat.mydemo.databinding.ActivityCustomRecyclerViewBinding

class CustomRecyclerViewActivity : AppCompatActivity(){
    private lateinit var binding: ActivityCustomRecyclerViewBinding
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpRecyclerView()
        binding.let {
            it.nextButton.setOnClickListener {
                Toast.makeText(this, "test", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, CustomSingleRecyclerViewActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun getQuantityData(): ArrayList<String> {
        val arrayList: ArrayList<String> = ArrayList()
        arrayList.add("10 kg")
        arrayList.add("110 kg")
        arrayList.add("120 kg")
        arrayList.add("150 kg")
        arrayList.add("170 kg")
        arrayList.add("180 kg")
        arrayList.add("90 kg")
        arrayList.add("70 kg")
        return arrayList
    }

    private fun setUpRecyclerView() {
        binding.recyclerView.let { rv ->
            rv.setHasFixedSize(true)
            rv.layoutManager = LinearLayoutManager(rv.context)
            recyclerViewAdapter = RecyclerViewAdapter()
            recyclerViewAdapter.submitList(getQuantityData())
            rv.adapter = recyclerViewAdapter
        }
    }
}