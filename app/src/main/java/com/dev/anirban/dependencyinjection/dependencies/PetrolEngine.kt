package com.dev.anirban.dependencyinjection.dependencies

import android.util.Log.d
import javax.inject.Inject

/**
 * Petrol Engine implementation of the Engine Class
 *
 * @property consume For Logging
 */
class PetrolEngine @Inject constructor() : Engine {

    private val tag = "petrol engine"

    override fun consume() {
        d(tag, "Consuming")
    }
}