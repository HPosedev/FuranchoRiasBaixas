package com.hposedev.furanchos2022.navigation

sealed class Screen(val route: String){
    object Home: Screen(route= "HomeScreen")
    object Detail: Screen(route = "DetailScreen")
}
