package org.test.eventos.models

abstract class ItemEvent{

    companion object {

        @JvmStatic
        val TYPE_EVENT = 0
        @JvmStatic
        val TYPE_PROMO = 1
    }

    abstract fun getType():Int

}