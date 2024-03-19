package com.event.app.publisher;

import com.event.app.event.UserRegisteredEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserPublisher {

    private final ApplicationEventPublisher eventPublisher;

    public UserPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void publishUserRegisteredEvent(String username, String password, byte age){
        System.out.println("PUBLISH: Event has been published");
        eventPublisher.publishEvent(new UserRegisteredEvent(username, password, age));
    }
}
