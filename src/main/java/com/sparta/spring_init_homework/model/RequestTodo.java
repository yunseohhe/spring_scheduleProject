package com.sparta.spring_init_homework.model;

public class RequestTodo {
    private String todo;
    private String name;
    private int password;

    public RequestTodo(String todo, String name, int password) {
        this.todo = todo;
        this.name = name;
        this.password = password;
    }

    public RequestTodo(RequestTodo requestTodo) {
        this.todo = requestTodo.getTodo();
        this.name = requestTodo.getName();
        this.password = requestTodo.getPassword();
    }

    public String getTodo() {
        return todo;
    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return "RequestTodo{" +
                "todo='" + todo + '\'' +
                ", name='" + name + '\'' +
                ", password=" + password +
                '}';
    }
}
