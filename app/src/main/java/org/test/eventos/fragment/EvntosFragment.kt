package org.test.eventos.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_evntos.*

import org.test.eventos.R
import org.test.eventos.adapters.EventoAdapter
import org.test.eventos.provider.EventData

class EvntosFragment : Fragment() {

    val adapter: EventoAdapter = EventoAdapter()
    val contenido:String by lazy { arguments!!.getString(EXTRA_CONTENIDO) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_evntos, container, false)
    }

    override fun onResume() {
        super.onResume()
        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(activity)
        loadData()
    }

    fun loadData(){
        adapter.data = EventData.listEvents()
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
