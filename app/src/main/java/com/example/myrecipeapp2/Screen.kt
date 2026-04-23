package com.example.myrecipeapp2

sealed class Screen(val route: String) {
    object RecipeScreen:Screen("recipescreen")
    object DetailScreen:Screen("detailscreen")
}