package com.firuz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firuz.adapter.RecyclerAdapter
import com.firuz.humolabapp.R
import com.firuz.model.ItemModel

class ProfileActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var weekRecyclerView: RecyclerView? = null
    private var itemModel  = listOf(
        ItemModel("Analytics"),
        ItemModel("Perfectionism"),
        ItemModel("Analytics"),
    )
    private var weekSideItemModel  = listOf(
        ItemModel("Perfectionism"),
        ItemModel("Analytics"),

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity)

        weekRecyclerView = findViewById(R.id.week_side_recycler_view)
        weekRecyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        weekRecyclerView?.adapter = RecyclerAdapter(weekSideItemModel)

        recyclerView = findViewById(R.id.strong_side_recycler_view)
        recyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView?.adapter = RecyclerAdapter(itemModel)


    }
}

