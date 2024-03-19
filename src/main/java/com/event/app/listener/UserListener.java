package com.event.app.listener;

import com.event.app.event.UserRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener {

    @EventListener
    public void listenUserRegisteredEvent(UserRegisteredEvent userRegisteredEvent){
        System.out.println("LISTENING: Event has been listened -> ".concat(userRegisteredEvent.toString()));
    }
}
