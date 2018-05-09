package org.test.eventos.util

import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast

fun ViewGroup.inflate(layout:Int) =
        LayoutInflater.from(context)
                .inflate(layout, this, false)

fun AppCompatActivity.toast(msg:String){
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

inline fun <reified T>Fragment.startActivity(vararg extras:Pair<String, Any>){
    val intent = Intent(activity, T::class.java)
    extras.forEach {
        val value = it.second
        when(value){
            is String -> intent.putExtra(it.first, value)
            is Int -> intent.putExtra(it.first, value)
        }
    }
    startActivity(intent)
}