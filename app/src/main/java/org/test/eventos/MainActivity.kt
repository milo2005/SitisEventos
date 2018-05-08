package org.test.eventos

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import org.test.eventos.adapters.EventoAdapter
import org.test.eventos.fragment.EvntosFragment
import org.test.eventos.provider.EventData
import org.test.eventos.util.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        nav.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_home -> setFragment(EvntosFragment.instance(""))
                R.id.nav_cine -> toast("cine")
                R.id.nav_salir -> toast("salir")
            }
            drawer.closeDrawer(nav)
            true
        }

        setFragment(EvntosFragment.instance(""))
    }

    //region Menu Opciones
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.action_search -> toast("click en buscar")
            android.R.id.home ->if(drawer.isDrawerOpen(nav)){
                drawer.closeDrawer(nav)
            } else{
                drawer.openDrawer(nav)
            }

        }
        return super.onOptionsItemSelected(item)
    }
    //endregion

    fun setFragment(fragment:Fragment){
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, fragment)
                .commit()
    }
}
