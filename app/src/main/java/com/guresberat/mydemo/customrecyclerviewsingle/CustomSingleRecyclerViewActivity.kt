package com.guresberat.mydemo.customrecyclerviewsingle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.guresberat.mydemo.databinding.ActivityCustomRecyclerViewBinding
import com.guresberat.mydemo.models.Item

class CustomSingleRecyclerViewActivity : AppCompatActivity(){
    private lateinit var binding : ActivityCustomRecyclerViewBinding
    private lateinit var recyclerViewAdapterSingle: RecyclerViewAdapterSingle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpRecyclerView()

    }

    private fun getQuantityData(): ArrayList<Item> {
       val arrayList : ArrayList<Item> = ArrayList()
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

    private fun setUpRecyclerView(){
        binding.recyclerView.let{ rv ->
            rv.setHasFixedSize(true)
            rv.layoutManager = LinearLayoutManager(rv.context)
            recyclerViewAdapterSingle = RecyclerViewAdapterSingle()
            rv.adapter =  recyclerViewAdapterSingle
            recyclerViewAdapterSingle.submitList(getQuantityData())
        }
    }

}