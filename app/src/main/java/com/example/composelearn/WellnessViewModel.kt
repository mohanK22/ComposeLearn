package com.example.composelearn

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask> get() = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) {
        _tasks.find { task ->
            task.id == item.id
        }?.let { task ->
            task.checked = checked
        }
    }
}

private fun getWellnessTasks() = List(50) { i ->
    WellnessTask(i, "Task # $i")
}
