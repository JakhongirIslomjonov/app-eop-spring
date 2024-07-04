package com.example.appeopspringboot.event;

import com.example.appeopspringboot.entity.Todo;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;
@Getter
public  final  class StatusEvent extends ApplicationEvent {

    private final Todo todo;



    public StatusEvent(Object source,Todo todo) {

        super(source);
        this.todo= todo;
    }
}
