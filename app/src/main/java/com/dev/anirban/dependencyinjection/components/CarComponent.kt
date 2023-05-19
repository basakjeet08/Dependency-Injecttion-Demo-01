package com.dev.anirban.dependencyinjection.components

import com.dev.anirban.dependencyinjection.MainActivity
import com.dev.anirban.dependencyinjection.dependent.Car
import dagger.Component

/**
 * This is a component class which makes the Dependency Graph
 * It is implemented by the Dagger 2 Library Itself and it is also used to actually  inject the
 * objects we need.
 * We can refer to the component class implemented by the Dagger 2 Library and get objects we need
 * from calling the specified functions in the component interface
 *
 * @property getCar This function makes a Car class object and returns it to the caller
 * @property inject This function injects the marked dependencies o the Main Activity only
 */
@Component
interface CarComponent {

    // This function makes a Car class object and returns it to the caller
    fun getCar(): Car

    // This function injects the marked dependencies o the Main Activity only
    fun inject(mainActivity: MainActivity)

}