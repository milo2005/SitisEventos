package org.test.eventos

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

class App:Application(){

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }

}