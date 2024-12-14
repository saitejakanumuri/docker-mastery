package com.tdevs.dockermastery.dto;

import java.util.List;

public class TodoResponse {
    private List<TodoDTO> todos;

    public TodoResponse(List<TodoDTO> todos) {
        this.todos = todos;
    }

    public List<TodoDTO> getTodos() {
        return todos;
    }

    public void setTodos(List<TodoDTO> todos) {
        this.todos = todos;
    }
}
