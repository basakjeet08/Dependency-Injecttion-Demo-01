package com.dev.anirban.dependencyinjection.dependent

import android.util.Log.d
import com.dev.anirban.dependencyinjection.dependencies.Fan
import com.dev.anirban.dependencyinjection.dependencies.Tail

/**
 * Lets think we cant do constructor injection in this class because this class is not owned by us
 * but is rather given from any third party library like retrofit or room database
 */
class Airplane(
    private val fan: Fan,
    private val tail: Tail
) {

    private val tag = "Airplane class"

    fun doFly() {
        d(tag, "flying")
    }
}