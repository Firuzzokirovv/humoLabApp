package com.firuz.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.firuz.humolabapp.R
import com.firuz.model.ItemData
import java.util.ArrayList

class HumTransferAdapter(private var itemData: List<ItemData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class HumTransferVeiwHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.hum_transfer_image)
        val countryName: TextView = view.findViewById(R.id.hum_transfer_countryName)
    }
    fun setFilteredList(itemData: List<ItemData>){
        this.itemData = itemData
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_hum_transfer_card_item,parent,false)
        return HumTransferVeiwHolder(view)
    }

    override fun getItemCount(): Int {
        return itemData.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemData[position]
        if(holder is HumTransferVeiwHolder){
            holder.image.setImageResource(item.image)
            holder.countryName.text = item.countryName
        }
    }

}