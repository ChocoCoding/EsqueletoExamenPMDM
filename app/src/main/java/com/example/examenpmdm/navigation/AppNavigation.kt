package com.example.examenpmdm.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.examenpmdm.screens.FirstScreen
import com.example.examenpmdm.screens.PrimerEjercicio
import com.example.examenpmdm.screens.SegundoEjercicio
import com.example.examenpmdm.screens.TercerEjercicio

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route) {
        composable(route = AppScreens.FirstScreen.route) {
            FirstScreen(navController)
        }
        composable(route = AppScreens.PrimerEjercicio.route) {
            PrimerEjercicio(navController)
        }
        composable(route = AppScreens.SegundoEjercicio.route) {
            SegundoEjercicio(navController)
        }
        composable(route = AppScreens.TercerEjercicio.route) {
            TercerEjercicio(navController)
        }

    }
}


