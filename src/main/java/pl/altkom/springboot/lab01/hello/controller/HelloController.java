package pl.altkom.springboot.lab01.hello.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public String hello(@RequestParam(value = "name", required = false) final String name) {
        return String.format("Hello %s!", Optional.ofNullable(name).orElse("World"));
    }
}
