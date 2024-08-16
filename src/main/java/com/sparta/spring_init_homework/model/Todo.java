package com.sparta.spring_init_homework.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
public class Todo {
    private String todo;
    private String name;
    private int password;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private Long id;
    private static Long addId = 0L;

    public Todo(RequestTodo requestTodo) {
        this.todo = requestTodo.getTodo();
        this.name = requestTodo.getName();
        this.password = requestTodo.getPassword();
        this.createAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
        this.id = ++addId;
    }

    public Todo() {
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todo='" + todo + '\'' +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", id=" + id +
                '}';
    }
}
