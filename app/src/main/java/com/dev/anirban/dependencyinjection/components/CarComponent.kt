package com.dev.anirban.dependencyinjection.components

import com.dev.anirban.dependencyinjection.MainActivity
import com.dev.anirban.dependencyinjection.dependent.Car
import com.dev.anirban.dependencyinjection.modules.DieselEngineModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

/**
 * This is a component class which makes the Dependency Graph
 * It is implemented by the Dagger 2 Library Itself and it is also used to actually  inject the
 * objects we need.
 * We can refer to the component class implemented by the Dagger 2 Library and get objects we need
 * from calling the specified functions in the component interface
 *
 * @property getCar This function makes a Car class object and returns it to the caller
 * @property inject This function injects the marked dependencies o the Main Activity only
 * @property DieselEngineModule This is the Module which state how to create the Engine class
 * implementation of the Car class object
 *
 * @property Builder This is a interface which is defined by us and can take in extra params when
 * called
 */
@Component(modules = [DieselEngineModule::class])
interface CarComponent {

    // This function makes a Car class object and returns it to the caller
    fun getCar(): Car

    // This function injects the marked dependencies o the Main Activity only
    fun inject(mainActivity: MainActivity)

    /**
     * This interface tells Dagger 2 how to implement the Component Class
     * We added extra functions so that we can send in extra parameters inside the dependency graph
     *
     * @property horsePower This is used to take horse power from the Main activity dynamically and
     * run the code accordingly
     *
     * @property build Defining the build method separately so that dagger implements it too
     */
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse-power") horsePower: Int): Builder

        @BindsInstance
        fun capacity(@Named("capacity") capacity: Int): Builder

        fun build(): CarComponent
    }
}