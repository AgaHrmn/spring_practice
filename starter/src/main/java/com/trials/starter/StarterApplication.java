package com.trials.starter;


import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.trials.starter.config.SayHello;


@SpringBootApplication
@Log
public class StarterApplication implements CommandLineRunner{
    private final SayHello sayHello;

    public StarterApplication(final SayHello sayHello){
        this.sayHello = sayHello;
    }


    public static void main(String[] args) {

        SpringApplication.run(StarterApplication.class, args);
    }

    @Override
    public void run(final String... args) {
        log.info(String.format("Hello, %s",
                sayHello.getName()));

    }
}
