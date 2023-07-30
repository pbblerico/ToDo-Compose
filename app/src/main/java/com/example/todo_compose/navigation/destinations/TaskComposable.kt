package com.example.todo_compose.navigation.destinations

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.todo_compose.ui.screens.task.TaskScreen
import com.example.todo_compose.ui.viewModels.SharedViewModel
import com.example.todo_compose.util.Action
import com.example.todo_compose.util.Constants
import com.example.todo_compose.util.Constants.TASK_ARGUMENT_KEY

fun NavGraphBuilder.taskComposable(
    sharedViewModel: SharedViewModel,
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = Constants.TASK_SCREEN,
        arguments = listOf(navArgument(Constants.TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ){ navBackStackEntry ->
        val taskId = navBackStackEntry.arguments?.getInt(TASK_ARGUMENT_KEY)
        if (taskId != null) {
            sharedViewModel.getSelectedTask(taskId = taskId)
        }
        val selectedTask by sharedViewModel.selectedTask.collectAsState()

        TaskScreen(
            selectedTask = selectedTask,
            navigateToListScreen = navigateToListScreen
        )
    }
}