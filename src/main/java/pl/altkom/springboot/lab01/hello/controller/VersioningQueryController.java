package pl.altkom.springboot.lab01.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/versioning/query")
@RestController
public class VersioningQueryController {

    @GetMapping
    public String versioning(@RequestParam(defaultValue = "1", name = "version") int version) {
        return version == 1
                ? "Query versioning version 1"
                : "Query versioning version 2";
    }
}
