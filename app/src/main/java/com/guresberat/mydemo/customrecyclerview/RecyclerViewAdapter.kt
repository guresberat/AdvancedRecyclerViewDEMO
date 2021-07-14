package com.guresberat.mydemo.customrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.guresberat.mydemo.R

class RecyclerViewAdapter() :
    RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {
    private var arrayList: ArrayList<String> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        holder.bind(arrayList[position])

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    fun submitList(array: ArrayList<String>) {
        arrayList = array
        notifyDataSetChanged()
    }


    class ItemViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val checkBox: CheckBox = itemView.findViewById(R.id.check_box)

        fun bind(name: String) {
            checkBox.text = name
        }

    }
}