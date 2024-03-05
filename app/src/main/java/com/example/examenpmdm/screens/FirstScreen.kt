package com.example.examenpmdm.screens
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.examenpmdm.navigation.AppScreens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FirstScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "Examen JetPackCompose 2ªEvaluación")
        }
    }) {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Botones de navegación",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Button(onClick = {
            navController.navigate(route = AppScreens.PrimerEjercicio.route)
        }) {
            Text("Primer Ejercicio")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens.SegundoEjercicio.route)
        }) {
            Text("Segundo Ejercicio")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens.TercerEjercicio.route)
        }) {
            Text("Tercer Ejercicio")
        }
    }
}
