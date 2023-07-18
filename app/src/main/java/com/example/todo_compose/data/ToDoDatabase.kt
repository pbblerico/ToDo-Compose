package com.example.todo_compose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todo_compose.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {
    abstract fun toDoDao(): ToDoDao
}