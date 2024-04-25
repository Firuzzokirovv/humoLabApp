package com.firuz


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.firuz.profile.ProfileActivity
import com.firuz.humolabapp.R

class NewsActivity : AppCompatActivity() {

    private var cardView1: CardView? = null
    private var cardView2: CardView? = null


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)


        cardView1 = findViewById<CardView>(R.id.card_1)
        cardView2 = findViewById<CardView>(R.id.card_2)


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