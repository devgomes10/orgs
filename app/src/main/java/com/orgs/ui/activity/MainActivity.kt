package com.orgs.ui.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.orgs.R
import com.orgs.R.id.nome
import com.orgs.model.Product
import com.orgs.ui.recyclerview.adapter.ProductListAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val name = findViewById<TextView>(nome)
//        name.text = "Cesta de frutas"
//        val description = findViewById<TextView>(R.id.descrição)
//        description.text = "Laranja, manga e maça"
//        val value = findViewById<TextView>(R.id.valor)
//        value.text = "19.99"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ProductListAdapter(
            context = this, products = listOf(
                Product(name = "teste", description = "teste desc", value = BigDecimal("19.99")),
                Product(name = "teste1", description = "teste desc1", value = BigDecimal("29.99")),
                )
        )
//        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}
