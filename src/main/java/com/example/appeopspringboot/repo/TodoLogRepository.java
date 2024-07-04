package com.example.appeopspringboot.repo;

import com.example.appeopspringboot.entity.TodoLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoLogRepository extends JpaRepository<TodoLog, Integer> {
}