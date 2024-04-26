package com.firuz.humoTransfer.transfer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.firuz.humolabapp.R
import com.firuz.humoTransfer.transfer.model.ItemData

class HumTransferAdapter(private var itemData: List<ItemData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class HumTransferViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.hum_transfer_image)
        val countryName: TextView = view.findViewById(R.id.hum_transfer_countryName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_hum_transfer_card_item,parent,false)
        return HumTransferViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemData.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemData[position]
        if(holder is HumTransferViewHolder){
            holder.image.setImageResource(item.image)
            holder.countryName.text = item.countryName
        }
        holder.itemView.setOnClickListener{
            val toast = if (item.countryName == item.countryName) item.countryName else ""
            Toast.makeText(holder.itemView.context, toast, Toast.LENGTH_SHORT).show()
        }
    }

}