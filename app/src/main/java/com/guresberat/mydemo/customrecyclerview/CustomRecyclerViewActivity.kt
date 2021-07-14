package com.guresberat.mydemo.customrecyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.guresberat.mydemo.customrecyclerviewsingle.CustomSingleRecyclerViewActivity
import com.guresberat.mydemo.databinding.ActivityCustomRecyclerViewBinding
import com.guresberat.mydemo.models.Item

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

    private fun getQuantityData(): ArrayList<Item> {
        val arrayList: ArrayList<Item> = ArrayList()
        arrayList.add(Item("1023 kg",position = 0))
        arrayList.add(Item("103 kg",position = 1))
        arrayList.add(Item("1054 kg",position = 2))
        arrayList.add(Item("1075 kg",position = 3))
        arrayList.add(Item("1056 kg",position = 4))
        arrayList.add(Item("102 kg",position = 5))
        arrayList.add(Item("105 kg",position = 6))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
        arrayList.add(Item("100 kg",position = 7))
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