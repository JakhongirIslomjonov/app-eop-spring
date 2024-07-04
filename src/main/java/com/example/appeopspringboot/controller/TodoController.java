package com.example.appeopspringboot.controller;

import com.example.appeopspringboot.repo.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TodoController {


    private final TodoRepository todoRepository;

    @GetMapping
    public String get() {
        return "worked";
    }

  /*  @PostMapping
    public HttpEntity<?> save(@RequestBody TodoDTO todoDTO) {


    }*/

}
