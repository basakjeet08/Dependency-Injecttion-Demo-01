package com.dev.anirban.dependencyinjection.dependencies

import android.util.Log.d
import javax.inject.Inject
import javax.inject.Named

/**
 * This is the implementation of the Engine Interface
 *
 * @property consume For Logging
 */
class DieselEngine @Inject constructor(
    @Named("horse-power") private val horsePower: Int,
    @Named("capacity") private val capacity: Int
) : Engine {

    private val tag = "Diesel engine"

    override fun consume() {
        d(tag, "Consuming $horsePower Horse Power with a capacity of $capacity")
    }
}