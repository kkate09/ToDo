package com.example.todo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter (
    private val todos: MutableList<ToDo>
):RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>(){
    class ToDoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        return  ToDoViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_todo,
                parent,
                false

            )
        )
    }

    override fun getItemCount(): Int {
       return (todos.size)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
      val curToDo = todos[position]
        holder.itemView.apply {

        }
    }
}
