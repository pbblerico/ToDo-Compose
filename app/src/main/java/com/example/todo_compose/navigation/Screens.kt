package com.example.todo_compose.navigation

import androidx.navigation.NavHostController
import com.example.todo_compose.util.Action
import com.example.todo_compose.util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = {action ->
        navController.navigate("list/$action") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = {taskId ->
        navController.navigate("task/$taskId")
    }
}