package com.sparta.spring_init_homework.controller;

import com.sparta.spring_init_homework.model.RequestTodo;
import com.sparta.spring_init_homework.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {
    List<Todo> requestTodoList = new ArrayList<>();

    @PostMapping
    public String saveTodo(@RequestBody RequestTodo requestTodo) {
        Todo todo = new Todo(requestTodo);
        requestTodoList.add(todo);
        return null;
    }

    @GetMapping
    public List<Todo> getTodos() {
        return requestTodoList;
    }
}
