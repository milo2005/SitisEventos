package org.test.eventos.util

import android.databinding.BindingAdapter
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("app:txtDateFormat")
fun setDateFormat(txt:TextView, date: Date){
    val dateFormat = SimpleDateFormat("yyyy/MM/dd", Locale.getDefault())
    txt.text = dateFormat.format(date)
}