package com.firuz.humoTransfer.transfer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.firuz.humoTransfer.MainScreen.model.ItemModel
import com.firuz.humolabapp.R
import com.firuz.humoTransfer.transfer.model.ItemData

class MainScreenHumTransferAdapter(private var itemModel: List<ItemModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class HumTransferViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.id_image_popular_country_flag)
        val countryName: TextView = view.findViewById(R.id.id_title_popular_country)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item_popular_country,parent,false)
        return HumTransferViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemModel.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemModel[position]
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