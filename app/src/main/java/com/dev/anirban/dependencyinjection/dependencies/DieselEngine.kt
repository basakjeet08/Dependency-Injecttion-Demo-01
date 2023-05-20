package com.dev.anirban.dependencyinjection.dependencies

import android.util.Log.d
import javax.inject.Inject

/**
 * This is the implementation of the Engine Interface
 *
 * @property consume For Logging
 */
class DieselEngine @Inject constructor() : Engine {

    private val tag = "Diesel engine"

    override fun consume() {
        d(tag, "Consuming")
    }
}