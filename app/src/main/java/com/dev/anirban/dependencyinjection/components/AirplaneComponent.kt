package com.dev.anirban.dependencyinjection.components

import com.dev.anirban.dependencyinjection.dependent.Airplane
import com.dev.anirban.dependencyinjection.modules.AirplaneModule
import dagger.Component

/**
 * This is the airplane component which provides the Airplane Object
 *
 * @property getAirplane This function provides the airplane object
 */
@Component(modules = [AirplaneModule::class])
interface AirplaneComponent {

    fun getAirplane(): Airplane

}