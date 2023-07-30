package com.example.todo_compose.ui.screens.task

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.todo_compose.data.models.ToDoTask
import com.example.todo_compose.util.Action


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen(
    selectedTask: ToDoTask?,
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold(
        topBar = {
                 TaskAppBar(
                     selectedTask = selectedTask,
                     navigateToListScreen = navigateToListScreen
                 )
        },
        content = {}
    )
}