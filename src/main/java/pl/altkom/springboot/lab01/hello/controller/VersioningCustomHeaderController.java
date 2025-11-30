package pl.altkom.springboot.lab01.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/versioning/header/custom")
@RestController
public class VersioningCustomHeaderController {

    @GetMapping(headers = "X-API-Version=1")
    public String versioningV1() {
        return "Custom header versioning version 1";
    }

    @GetMapping(headers = "X-API-Version=2")
    public String versioningV2() {
        return "Custom header versioning version 2";
    }
}
