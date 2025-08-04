package com.example.myspb.listener;

import com.example.myspb.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zrq
 * @time 2025/8/4 16:09
 * @description
 */
@Component
public class MessageListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("消息已发送--->" + event.getMessage());
    }
}
