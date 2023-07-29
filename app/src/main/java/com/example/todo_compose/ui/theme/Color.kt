package com.example.todo_compose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val LightGray = Color(0xFFFCFCFC)
val MediumGray = Color(0xFF9C9C9C)
val DarkGray = Color(0xFF141414)

val LowPriorityColor = Color(0xFF00C980)
val MediumPriorityColor = Color(0xFFFFC114)
val HighPriorityColor = Color(0XFFFF4646)
val NonePriorityColor = Color(0xFFFFFFFF)



val ColorScheme.fabBackgroundColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Pink80 else Pink40
val ColorScheme.topAppBarContentColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Color.White else LightGray
val ColorScheme.topAppBarBackgroundColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Purple80 else Color.Black


val ColorScheme.taskItemBackgroundColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Color.White else DarkGray
val ColorScheme.taskItemTextColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) DarkGray else LightGray
