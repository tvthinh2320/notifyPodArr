package org.notifyPodArr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
public class NotifyPodArrApplication extends SpringServletContainerInitializer {

    public static void main(String[] args) {
        SpringApplication.run(NotifyPodArrApplication.class, args);
    }
}
