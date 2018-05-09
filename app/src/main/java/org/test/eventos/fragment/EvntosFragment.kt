package org.test.eventos.fragment


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_evntos.*
import org.test.eventos.DetailEventActivity

import org.test.eventos.R
import org.test.eventos.adapters.EventoAdapter
import org.test.eventos.models.ItemEvent
import org.test.eventos.provider.EventData
import org.test.eventos.util.startActivity

class EvntosFragment : Fragment() {

    val adapter: EventoAdapter = EventoAdapter(this::goToDetail)
    val contenido:String by lazy { arguments!!.getString(EXTRA_CONTENIDO) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_evntos, container, false)
    }

    override fun onResume() {
        super.onResume()
        list.adapter = adapter
        val columns:Int = resources.getInteger(R.integer.column)
        list.layoutManager = GridLayoutManager(activity, columns)
        loadData()
    }

    fun loadData(){
        adapter.data = EventData.listEvents()
    }

    fun goToDetail(pos:Int, type:Int){
        /*val intent: Intent = when(type){
            ItemEvent.TYPE_EVENT -> Intent(activity, DetailEventActivity::class.java)
            else -> Intent(activity, DetailEventActivity::class.java)
        }
        startActivity(intent)*/
        when(type){
            ItemEvent.TYPE_EVENT -> startActivity<DetailEventActivity>()
        }
    }

    companion object {
        private  val EXTRA_CONTENIDO = "contenido"

        fun instance(contenido:String):EvntosFragment {
            val fragment = EvntosFragment()

            val args = Bundle()
            args.putString(EXTRA_CONTENIDO, contenido)

            fragment.arguments = args

            return fragment


        }
    }

}
