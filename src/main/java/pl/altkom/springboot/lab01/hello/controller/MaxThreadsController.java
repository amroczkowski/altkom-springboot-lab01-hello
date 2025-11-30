package pl.altkom.springboot.lab01.hello.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/thread")
@RestController
public class MaxThreadsController {

    @GetMapping("/sleep")
    public void sleep() throws InterruptedException {
        final String threadName = Thread.currentThread().getName();
        log.info("{} {} sleeping...", LocalDateTime.now(), threadName);
        Thread.sleep(10000);
        log.info("{} {} woke up", LocalDateTime.now(), threadName);

        /*
        curl "http://localhost:8080/app/thread/sleep" &
        curl "http://localhost:8080/app/thread/sleep" &
        curl "http://localhost:8080/app/thread/sleep" &
        wait
         */
    }
}
