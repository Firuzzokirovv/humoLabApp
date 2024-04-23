package com.firuz.humoTransfer

import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firuz.adapter.HumTransferAdapter
import com.firuz.humolabapp.R
import com.firuz.model.ItemData
import java.util.Locale

class TransferHumActivity : AppCompatActivity() {

    private var searchView: SearchView? = null
    private var recyclerView: RecyclerView? = null
    private var adapter: HumTransferAdapter? = null
    private var countryModel = listOf(
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

        searchView = findViewById(R.id.searchView)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView?.setHasFixedSize(true)
        recyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView?.adapter = HumTransferAdapter(countryModel)

        searchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })
    }

private fun filterList(query: String?) {
    if (query != null){
        val filteredList = ArrayList<ItemData>()
        for(i in countryModel){
            if(i.countryName.lowercase(Locale.ROOT).contains(query)){
                filteredList.add(i)
            }
        }
        if(filteredList.isEmpty()){
            Toast.makeText(this, "Ничего не найдено", Toast.LENGTH_SHORT).show()
        }else {
            adapter?.setFilteredList(filteredList)
            }
        }
    }
}