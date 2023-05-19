package com.dev.anirban.dependencyinjection.modules

import com.dev.anirban.dependencyinjection.dependencies.Fan
import com.dev.anirban.dependencyinjection.dependencies.Tail
import com.dev.anirban.dependencyinjection.dependent.Airplane
import dagger.Module
import dagger.Provides

/**
 * Modules provide the necessary way to provide any dependency when it can't be done by constructor
 * injection
 *
 * @property provideFan This function creates a Fan object and returns it
 * @property provideTail This function creates a Tail Object and returns it
 * @property provideAirplane This function creates the airplane object after taking the tail and fan
 * from the provides functions in the module
 *
 */
@Module
class AirplaneModule {

    @Provides
    fun provideFan(): Fan {
        return Fan()
    }

    @Provides
    fun provideTail(): Tail {
        return Tail()
    }

    @Provides
    fun provideAirplane(tail: Tail, fan: Fan): Airplane {
        return Airplane(
            fan = fan,
            tail = tail
        )
    }
}