package com.example.myspb.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * @author zrq
 * @time 2025/8/4 16:07
 * @description
 */
@Getter
@Setter
public class MyEvent extends ApplicationEvent {

    private final String message;

    public MyEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}
