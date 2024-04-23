package com.firuz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firuz.adapter.RecyclerAdapter
import com.firuz.humolabapp.R
import com.firuz.model.ItemModel

class ProfileActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var weekRecyclerView: RecyclerView? = null
    private var myReportRecyclerView: RecyclerView? = null
    private var itemModel  = listOf(
        ItemModel(1,1,"Analytics","", false),
        ItemModel(1,1,"Perfectionism","", false),
        ItemModel(1,1,"Analytics","", false),
    )
    private var weekSideItemModel  = listOf(
        ItemModel(1,1,"Perfectionism","", false),
        ItemModel(1,1,"Analytics","", false),
    )
    private var myReportItemModel  = listOf(
        ItemModel(
            R.drawable.ic_user,
            R.drawable.ic_vector,
            "Astro-psychological report",
            "Some short description of this type of report.",
            true),
        ItemModel(
            R.drawable.ic_check,
            R.drawable.ic_vector,
            "Daily Prediction",
            "Some short description of this type of report.",
            true),
        ItemModel(
            R.drawable.ic_calendar,
            R.drawable.ic_vector,
            "Monthly prediction report",
            "Some short description of this type of report.",
            true
        ),
        ItemModel(
            R.drawable.ic_heart,
            R.drawable.ic_vector,
            "Love report",
            "Some short description of this type of report.",
            false
        ),
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

        myReportRecyclerView = findViewById(R.id.my_report_recycler_view)
        myReportRecyclerView?.layoutManager = GridLayoutManager(this,2)
        myReportRecyclerView?.adapter = RecyclerAdapter(myReportItemModel)


    }
}

