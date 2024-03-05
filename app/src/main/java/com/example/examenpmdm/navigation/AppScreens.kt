package com.example.examenpmdm.navigation

sealed class AppScreens(val route : String){
    object FirstScreen: AppScreens("first_screen")
    object PrimerEjercicio: AppScreens("primer_ejercicio")
    object SegundoEjercicio: AppScreens("segundo_ejercicio")
    object TercerEjercicio: AppScreens("tercer_ejercicio")
}
