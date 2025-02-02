package com.rahim.harmony.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.rahim.harmony.feature.home.HomeScreenRoute
import com.rahim.harmony.navigation.Destinations
import kotlinx.coroutines.Dispatchers

fun NavController.navigateToHome(navOptions: NavOptions? = null){
    this.navigate(Destinations.Home.route, navOptions)
}

fun NavGraphBuilder.homeScreen(){
    Dispatchers.IO
    composable(Destinations.Home.route){
        HomeScreenRoute()
    }
}