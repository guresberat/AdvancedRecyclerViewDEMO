package com.guresberat.mydemo.customrecyclerviewsingle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.guresberat.mydemo.customrecyclerview.QuantityListener
import com.guresberat.mydemo.customrecyclerview.RecyclerViewAdapterSingle
import com.guresberat.mydemo.databinding.ActivityCustomRecyclerViewBinding

class CustomSingleRecyclerViewActivity : AppCompatActivity(), QuantityListener {
    private lateinit var binding : ActivityCustomRecyclerViewBinding
    private lateinit var recyclerViewAdapterSingle: RecyclerViewAdapterSingle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recyclerViewAdapterSingle = RecyclerViewAdapterSingle(this)
        recyclerViewAdapterSingle.submitList(getQuantityData())
        setUpRecyclerView()
    }

    private fun getQuantityData(): ArrayList<String> {
       val arrayList : ArrayList<String> = ArrayList()
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

    private fun setUpRecyclerView(){
        binding.recyclerView.let{ rv ->
            rv.setHasFixedSize(true)
            rv.layoutManager = LinearLayoutManager(rv.context)
            rv.adapter =  recyclerViewAdapterSingle
        }
    }

    override fun onQuantityChange(arrayList: ArrayList<String>) {
        Toast.makeText(this,arrayList.toString(),Toast.LENGTH_SHORT).show()
    }
}