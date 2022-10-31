package com.example.comptest

sealed class Screen(val route: String){
    object Home: Screen(route = "home_screen")
    object  Detail: Screen(route = "detail_screen")

}
