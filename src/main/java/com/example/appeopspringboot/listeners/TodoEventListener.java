package com.example.appeopspringboot.listeners;

import com.example.appeopspringboot.entity.Todo;
import com.example.appeopspringboot.event.StatusEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TodoEventListener {


    @EventListener
    public void getStatus(StatusEvent statusEvent) {
        Todo todo = statusEvent.getTodo();


        todo.setEvent(false);
    }
}
