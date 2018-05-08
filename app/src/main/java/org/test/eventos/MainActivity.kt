package org.test.eventos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.test.eventos.adapters.EventoAdapter
import org.test.eventos.provider.EventData

class MainActivity : AppCompatActivity() {

    val adapter:EventoAdapter = EventoAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(this)
        loadData()
    }

    fun loadData(){
        adapter.data = EventData.listEvents()
    }
}
