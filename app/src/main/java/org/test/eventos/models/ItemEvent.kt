package org.test.eventos.models

abstract class ItemEvent{

    companion object {
        val TYPE_EVENT = 0
        val TYPE_PROMO = 1
    }

    abstract fun getType():Int

}