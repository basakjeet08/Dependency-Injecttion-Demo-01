package com.dev.anirban.dependencyinjection.modules

import com.dev.anirban.dependencyinjection.dependencies.DieselEngine
import com.dev.anirban.dependencyinjection.dependencies.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * This is the module class of the Diesel engine
 * It provides the way how we  can create an Engine implementation of type Diesel and give it to
 * our car objects when they would need it
 *
 * @property bindEngine This function returns the Diesel Engine object for the car class object
 */
@Module
interface DieselEngineModule {

    @Binds
    fun bindEngine(dieselEngine: DieselEngine): Engine
}