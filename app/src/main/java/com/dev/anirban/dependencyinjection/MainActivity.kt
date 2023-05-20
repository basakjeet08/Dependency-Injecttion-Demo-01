package com.dev.anirban.dependencyinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.dev.anirban.dependencyinjection.components.AirplaneComponent
import com.dev.anirban.dependencyinjection.components.CarComponent
import com.dev.anirban.dependencyinjection.components.DaggerAirplaneComponent
import com.dev.anirban.dependencyinjection.components.DaggerCarComponent
import com.dev.anirban.dependencyinjection.core.ui.theme.DependencyInjectionTheme
import com.dev.anirban.dependencyinjection.dependent.Car
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    // Component Object which gives the dependencies or injects them
    private lateinit var carComponent: CarComponent

    // Airplane Component object which gives the dependencies of Airplanes
    private lateinit var airplaneComponent: AirplaneComponent

    // Field Injection is done here
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DependencyInjectionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    // defining the component variable
                    carComponent = DaggerCarComponent.builder().build()

                    // Injecting dependencies to all the fields
                    carComponent.inject(this)

                    // Getting the dependency from the function
                    val car2 = carComponent.getCar()

                    // Defining the airplane component
                    airplaneComponent = DaggerAirplaneComponent.builder().build()

                    // Taking one Airplane object using the airplane component
                    val airplane = airplaneComponent.getAirplane()

                    airplane.doFly()

                    car.doDrive()
                    car2.doDrive()
                }
            }
        }
    }
}