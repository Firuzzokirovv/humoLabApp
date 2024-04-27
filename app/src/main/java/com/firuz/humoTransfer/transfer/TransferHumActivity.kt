package com.firuz.humoTransfer.transfer

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firuz.humoTransfer.transfer.adapter.HumTransferAdapter
import com.firuz.humoTransfer.MainScreen.MainScreenHumTransferActivity
import com.firuz.humolabapp.R
import com.firuz.humoTransfer.transfer.model.ItemData
import java.util.Locale

class TransferHumActivity : AppCompatActivity() {

    private var searchView: SearchView? = null
    private var recyclerView: RecyclerView? = null
    private var adapter: HumTransferAdapter? = null
    private var btnBack: ImageButton? = null
    private var transferCardItem: LinearLayout? = null
    private var countryModel = ArrayList<ItemData>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_transfer_hum_activity)


        transferCardItem = findViewById(R.id.transfer_card_item_id)
        btnBack = findViewById(R.id.btn_back)
        searchView = findViewById(R.id.id_searchView_hum_transfer)

        btnBack?.setOnClickListener{
            val intent = Intent(this, MainScreenHumTransferActivity::class.java)
            startActivity(intent)
        }



        recyclerView = findViewById(R.id.recyclerView)
        recyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        dataCountry()
        adapter = HumTransferAdapter(countryModel)
        recyclerView?.adapter = adapter


        searchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                filterList(query)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return false
            }

        })


    }

    private fun filterList(query: String?) {
        if (query != null){
            val filteredList = ArrayList<ItemData>()
            for(country in countryModel){
                if(country.countryName.lowercase(Locale.ROOT).contains((query))){
                    filteredList.add(country)
                }
            }
            if(filteredList.isNotEmpty()){
                adapter?.setFilteredList(filteredList)
            } else{
                Toast.makeText(this, "Ничего ненайдено", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun dataCountry() {
        countryModel.add(ItemData("Россия",R.drawable.flag_rus))
        countryModel.add(ItemData("Таджикистан",R.drawable.flag_taj))
        countryModel.add(ItemData("Узбекистан", R.drawable.flag_uzb))
        countryModel.add(ItemData("Казахстан",R.drawable.flag_kz))
        countryModel.add(ItemData("ОАЕ",R.drawable.flag_oae))
        countryModel.add(ItemData("Корея",R.drawable.flag_korea))
        countryModel.add(ItemData("Украина",R.drawable.flag_ukraina))
    }

}