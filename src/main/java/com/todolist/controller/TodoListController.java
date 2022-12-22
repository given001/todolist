package com.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class TodoListController {

    @Autowired
    private TodoListRepository todoListRepository;

    @GetMapping(path = "/create")
    public String create(Model model) {
        model.addAttribute("todolist", new TodoList());
        return "create";
    }

    @PostMapping(path = "/index")
    public String index(@ModelAttribute TodoList todoList, Model model) {

        if (todoList != null) {
            if( null != todoListRepository.save(todoList)) {
                todoList = null;
            }
        }

        Iterable<TodoList> todoLists =  todoListRepository.findAll();
        if(todoLists.iterator().hasNext()) {
            model.addAttribute("todolists", todoLists);
        }
        return "index";
    }
}
