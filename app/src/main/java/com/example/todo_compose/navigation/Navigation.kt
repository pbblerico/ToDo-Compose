package com.example.todo_compose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.todo_compose.navigation.destinations.listComposable
import com.example.todo_compose.navigation.destinations.taskComposable
import com.example.todo_compose.ui.viewModels.SharedViewModel
import com.example.todo_compose.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            sharedViewModel = sharedViewModel,
            navigateToListScreen = screen.list
        )
    }
}