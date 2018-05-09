package org.test.eventos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_detail_event.*
import org.test.eventos.models.Evento
import org.test.eventos.provider.EventData

class DetailEventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_event)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val pos:Int = intent.extras.getInt("pos")
        val data = EventData.listEvents()[pos] as Evento
        collapsingToolbar.title = data.nombre
        img.setImageURI(data.imagen)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}
