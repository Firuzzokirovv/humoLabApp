package com.firuz.humoTransfer.MainScreen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firuz.humoTransfer.MainScreen.model.ItemModel
import com.firuz.humoTransfer.transfer.TransferHumActivity
import com.firuz.humoTransfer.transfer.adapter.HumTransferAdapter
import com.firuz.humoTransfer.transfer.adapter.MainScreenHumTransferAdapter
import com.firuz.humoTransfer.transfer.model.ItemData
import com.firuz.humolabapp.R

class MainScreenHumTransferActivity : AppCompatActivity() {

    private var button: Button? = null
    private var recyclerView: RecyclerView? = null
    private var transferCardItem: LinearLayout? = null
    private var countryModel = arrayListOf(
        ItemModel("Таджикистан",R.drawable.flag_taj),
        ItemModel("Россия",R.drawable.flag_rus),
        ItemModel("Узбекистан", R.drawable.flag_uzb),
    )
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main_screen_humo_transfer)

        button = findViewById(R.id.btnSendTransfer)
        transferCardItem = findViewById(R.id.transfer_card_item_id)

        button?.setOnClickListener() {
            val intent = Intent(this, TransferHumActivity::class.java)
            startActivity(intent)
        }

        recyclerView = findViewById(R.id.id_popular_country_recycler_view)
        recyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView?.adapter = MainScreenHumTransferAdapter(countryModel)


    }
}