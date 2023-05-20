package com.dev.anirban.dependencyinjection.dependencies

import android.util.Log.d

/**
 * Petrol Engine implementation of the Engine Class
 *
 * @property consume For Logging
 */
class PetrolEngine(
    private val horsePower: Int
) : Engine {

    private val tag = "petrol engine"

    override fun consume() {
        d(tag, "Consuming $horsePower Horsepower")
    }
}