package com.example.spisok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taskListView = findViewById<ListView>(R.id.task_lv)


        val taskList = ArrayList<String>()
        taskList.add("Помыть кота")
        taskList.add("Открыть банку огурцов")
        taskList.add("Сделать домашку")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)

        taskListView.adapter = adapter

        val NewTaskET = findViewById<EditText>(R.id.new_task_et)
        val addTaskBtn = findViewById<Button>(R.id.new_task_btn)


        addTaskBtn.setOnClickListener{
            taskList.add(NewTaskET.text.toString())
            NewTaskET.setText("")
        }
    }
}