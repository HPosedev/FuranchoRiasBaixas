package com.hposedev.furanchos2022

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hposedev.furanchos2022.navigation.Screen
import com.hposedev.furanchos2022.ui.theme.DetailedScreen
import com.hposedev.furanchos2022.ui.theme.FuranchoList


@Composable
fun Navigation(navController: NavHostController) {


    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            FuranchoList(navController = navController)
        }
        composable(route = Screen.Detail.route) {
            DetailedScreen(navController = navController)
        }
    }
}
