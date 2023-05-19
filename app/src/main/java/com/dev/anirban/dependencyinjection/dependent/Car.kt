package com.dev.anirban.dependencyinjection.dependent

import android.util.Log.d
import com.dev.anirban.dependencyinjection.dependencies.Engine
import com.dev.anirban.dependencyinjection.dependencies.Radio
import com.dev.anirban.dependencyinjection.dependencies.Wheel
import javax.inject.Inject

/**
 * Car class which needs engine, radio, wheel class objects to run
 *
 * @param engine This is the engine class object
 * @param wheel This is the wheel class object
 * @param radio This is the radio class object
 */
class Car @Inject constructor(
    private val engine: Engine,
    private val wheel: Wheel,
    private val radio: Radio
) {

    // Tag for debugging
    private val tag = "Car Class"

    // Drive method
    fun doDrive() {
        d(tag, "Car is driving")
    }
}