package com.firuz.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.firuz.profile.model.MyReportModel
import com.firuz.humolabapp.R
import com.firuz.model.ItemModel


class RecyclerAdapter(private val itemList: List<ItemModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    class StrongSideViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView: TextView = itemView.findViewById(R.id.strong_side_textView)
    }
    class WeekSideViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView: TextView = itemView.findViewById(R.id.week_side_textView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            STRONG_SIDE_VIEW_TYPE -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.strong_side_card_item,parent,false)
                StrongSideViewHolder(view)
            }
            WEEK_SIDE_VIEW_TYPE -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.week_side_card_item,parent,false)
                WeekSideViewHolder(view)
            }
            else -> {
                throw Exception("$viewType")
            }
        }
    }
    override fun getItemCount(): Int {
        return itemList.size
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemList[position]
         when (holder) {
             is StrongSideViewHolder -> {
                holder.textView.text = item.title
             }
             is  WeekSideViewHolder -> {
                holder.textView.text = item.title
             }

             else -> throw Exception("$item")

         }


    }
    companion object {
        const val WEEK_SIDE_VIEW_TYPE = 1
        const val STRONG_SIDE_VIEW_TYPE = 0
    }

}

