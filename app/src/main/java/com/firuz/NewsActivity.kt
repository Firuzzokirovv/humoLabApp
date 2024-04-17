package com.firuz


import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firuz.humolabapp.R
import com.firuz.second.second_activity

class NewsActivity : AppCompatActivity() {

    private var cardView1: CardView? = null
    private var cardView2: CardView? = null
    private var numberPanel: RecyclerView? = null


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)


        cardView1 = findViewById<CardView>(R.id.card_1)
        cardView2 = findViewById<CardView>(R.id.card_2)
        numberPanel = findViewById(R.id.numberPanel)
        numberPanel?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


        cardView1?.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        cardView2?.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }



    }
}