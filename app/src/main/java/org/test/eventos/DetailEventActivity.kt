package org.test.eventos

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_detail_event.*
import org.test.eventos.databinding.ActivityDetailEventBinding
import org.test.eventos.models.Evento
import org.test.eventos.provider.EventData

class DetailEventActivity : AppCompatActivity() {

    lateinit var binding:ActivityDetailEventBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_event)

        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val pos:Int = intent.extras.getInt("pos")
        val data = EventData.listEvents()[pos] as Evento

        binding.evento = data
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}
