package com.todolist.controller;

import com.todolist.controller.TodoList;
import org.springframework.data.repository.CrudRepository;

public interface TodoListRepository extends CrudRepository<TodoList, Integer> {
}
