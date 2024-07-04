package com.example.appeopspringboot.repo;

import com.example.appeopspringboot.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}