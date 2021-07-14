package com.guresberat.mydemo.customrecyclerview

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.guresberat.mydemo.R

class RecyclerViewAdapterSingle(private var quantityListener: QuantityListener) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var arrayList: ArrayList<String> = ArrayList()
    private var arrayList0: ArrayList<String> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.e(TAG, "onBindViewHolder: ")
        when (holder) {
            is ViewHolder -> {
                holder.bind(arrayList[position])
                if (holder.checkBox.isChecked) {
                    arrayList0.add(arrayList[position])
                } else {
                    arrayList0.remove(arrayList[position])
                }
            }
        }
        quantityListener.onQuantityChange(arrayList0)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    fun submitList(array: ArrayList<String>) {
        arrayList = array
        notifyDataSetChanged()
    }


    class ViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val checkBox: CheckBox = itemView.findViewById(R.id.check_box)

        fun bind(name: String) {
            checkBox.text = name
        }

    }
}