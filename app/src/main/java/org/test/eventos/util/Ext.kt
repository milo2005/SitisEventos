package org.test.eventos.util

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