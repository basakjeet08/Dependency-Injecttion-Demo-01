package com.dev.anirban.dependencyinjection.modules

import com.dev.anirban.dependencyinjection.dependencies.Engine
import com.dev.anirban.dependencyinjection.dependencies.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule(
    private val horsePower: Int
) {

    @Provides
    fun provideEngine(): Engine {
        return PetrolEngine(horsePower)
    }
}