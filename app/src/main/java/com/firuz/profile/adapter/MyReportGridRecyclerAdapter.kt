package com.firuz.profile.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.firuz.profile.model.MyReportModel
import com.firuz.humolabapp.R

class MyReportGridRecyclerAdapter(private var itemModel: List<MyReportModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class MyReportViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.my_report_image)
        val icon: ImageView = itemView.findViewById(R.id.my_report_icon)
        val title: TextView = itemView.findViewById(R.id.my_report_title)
        val subtitle: TextView = itemView.findViewById(R.id.my_report_subtitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_report_card_item,parent,false)
        return MyReportViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemModel.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemModel[position]
        if (holder is MyReportViewHolder) {
            holder.image.setImageResource(item.image)
            holder.title.text = item.title
            holder.subtitle.text = item.subtitle
            if(item.isFavorite){
                holder.icon.visibility = View.VISIBLE
                holder.icon.setImageResource(item.icon)
            }
            else{
                holder.icon.visibility = View.GONE
            }

        } else { throw Exception("$item") }
    }

}