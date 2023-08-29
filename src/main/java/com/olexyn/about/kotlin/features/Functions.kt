package com.olexyn.about.kotlin.features

import com.olexyn.about.java.kotlin.features.Strings
import java.util.*

class Functions {

    private var INSTANCE: Strings? = null
    val instance: Strings?
        get() {
            if (INSTANCE == null) {
                synchronized(Strings::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE =
                                Strings()
                    }
                }
            }
            return INSTANCE
        }


    fun String.lool(): String {
        return "lool"
    }

    init {
        val test = "test".lool()
    }

}

class ScopedFunctions {

    init {

    }
}

fun main() {

    // let is a scoping function, it allows to execute a block of code on an object
    "foo".let { println(it) } // prints "foo"
    null.let { println(it) } // prints "null"
    // together with ? it can be used to perform an "if present, then do" operation
    null?.let { println("" + it) }  // prints nothing
    "bar"?.let { println(it) } // prints "bar"

    mutableListOf<String>()
            .apply { add("A") }
            .also { mutableList -> mutableList.add("B") }
            .let { it.add("C") }

    val date: Calendar? = Calendar.getInstance().apply { add(Calendar.DAY_OF_YEAR, 3) }

    val br = 0

}