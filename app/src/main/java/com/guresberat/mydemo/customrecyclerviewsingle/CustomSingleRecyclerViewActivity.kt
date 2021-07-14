package com.guresberat.mydemo.customrecyclerviewsingle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.guresberat.mydemo.databinding.ActivityCustomRecyclerViewBinding

class CustomSingleRecyclerViewActivity : AppCompatActivity(){
    private lateinit var binding : ActivityCustomRecyclerViewBinding
    private lateinit var recyclerViewAdapterSingle: RecyclerViewAdapterSingle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpRecyclerView()

    }

    private fun getQuantityData(): ArrayList<RecyclerViewAdapterSingle.Items> {
       val arrayList : ArrayList<RecyclerViewAdapterSingle.Items> = ArrayList()
       arrayList.add(RecyclerViewAdapterSingle.Items("1023 kg",position = 0))
       arrayList.add(RecyclerViewAdapterSingle.Items("103 kg",position = 1))
       arrayList.add(RecyclerViewAdapterSingle.Items("1054 kg",position = 2))
       arrayList.add(RecyclerViewAdapterSingle.Items("1075 kg",position = 3))
       arrayList.add(RecyclerViewAdapterSingle.Items("1056 kg",position = 4))
       arrayList.add(RecyclerViewAdapterSingle.Items("102 kg",position = 5))
       arrayList.add(RecyclerViewAdapterSingle.Items("105 kg",position = 6))
       arrayList.add(RecyclerViewAdapterSingle.Items("100 kg",position = 7))
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