package com.dev.anirban.dependencyinjection.modules

import com.dev.anirban.dependencyinjection.dependencies.Engine
import com.dev.anirban.dependencyinjection.dependencies.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun provideEngine(petrolEngine: PetrolEngine): Engine {
        return petrolEngine
    }
}