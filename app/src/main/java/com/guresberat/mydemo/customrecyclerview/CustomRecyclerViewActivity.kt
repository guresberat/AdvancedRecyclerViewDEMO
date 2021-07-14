package com.guresberat.mydemo.customrecyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.guresberat.mydemo.databinding.ActivityCustomRecyclerViewBinding

class CustomRecyclerViewActivity : AppCompatActivity(), QuantityListener {
    private lateinit var binding: ActivityCustomRecyclerViewBinding
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recyclerViewAdapter = RecyclerViewAdapter(this)
        recyclerViewAdapter.submitList(getQuantityData())
        setUpRecyclerView()
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
            rv.adapter = recyclerViewAdapter
        }
    }

    override fun onQuantityChange(arrayList: ArrayList<String>) {
        Toast.makeText(this, arrayList.toString(), Toast.LENGTH_SHORT).show()
    }
}