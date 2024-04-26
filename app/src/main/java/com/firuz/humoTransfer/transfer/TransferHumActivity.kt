package com.firuz.humoTransfer.transfer

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firuz.humoTransfer.transfer.adapter.HumTransferAdapter
import com.firuz.humoTransfer.MainScreen.MainScreenHumTransferActivity
import com.firuz.humolabapp.R
import com.firuz.humoTransfer.transfer.model.ItemData

class TransferHumActivity : AppCompatActivity() {

    private var searchView: SearchView? = null
    private var recyclerView: RecyclerView? = null
    private var adapter: HumTransferAdapter? = null
    private var btnBack: ImageButton? = null
    private var transferCardItem: LinearLayout? = null
    private var countryModel = arrayListOf(
        ItemData("Россия",R.drawable.flag_rus),
        ItemData("Таджикистан",R.drawable.flag_taj),
        ItemData("Узбекистан", R.drawable.flag_uzb),
        ItemData("Казахстан",R.drawable.flag_kz),
        ItemData("ОАЕ",R.drawable.flag_oae),
        ItemData("Корея",R.drawable.flag_korea),
        ItemData("Украина",R.drawable.flag_ukraina),
    )


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_transfer_hum_activity)

        transferCardItem = findViewById(R.id.transfer_card_item_id)
        btnBack = findViewById(R.id.btn_back)
        searchView = findViewById(R.id.searchView)

        btnBack?.setOnClickListener{
            val intent = Intent(this, MainScreenHumTransferActivity::class.java)
            startActivity(intent)
        }



        recyclerView = findViewById(R.id.recyclerView)
        recyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView?.adapter = HumTransferAdapter(countryModel)



    }


}