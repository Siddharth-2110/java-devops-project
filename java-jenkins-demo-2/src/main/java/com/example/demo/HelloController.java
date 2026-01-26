package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class HelloController {

    // This increments once every time the class is loaded (i.e. recompile/restart)
    private static final AtomicInteger DEPLOY_COUNTER = new AtomicInteger(1);

    // Capture deployment count at startup
    private static final int CURRENT_DEPLOYMENT = DEPLOY_COUNTER.getAndIncrement();

    @GetMapping("/")
    public String hello() {
        String currentTime = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        return "My first deployment using CI-CD Pipeline! "
                + "Deployment #" + CURRENT_DEPLOYMENT
                + " | Time: " + currentTime + " This is application 2 ";
    }
}

