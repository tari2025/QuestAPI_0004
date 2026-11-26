package com.example.mydata.uicontroller.route


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mydatas.uicontroller.view.HalamanEntryScreen
import com.example.mydatas.uicontroller.view.HalamanHomeScreen

@Composable
fun DataSiswaApp(navController: NavHostController = rememberNavController(), modifier: Modifier) {
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        composable(DestinasiHome.route) {
            HalamanHomeScreen(navigateToItemEntry = { navController.navigate(DestinasiEntry.route) })
        }
        composable(DestinasiEntry.route) {
            HalamanEntryScreen(navigateBack = { navController.navigate(DestinasiHome.route) })
        }
    }
}