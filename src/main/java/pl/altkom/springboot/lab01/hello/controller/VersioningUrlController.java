package pl.altkom.springboot.lab01.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/versioning/url")
@RestController
public class VersioningUrlController {

    @GetMapping("/v1")
    public String versioningV1() {
        return "Url versioning version 1";
    }

    @GetMapping("/v2")
    public String versioningV2() {
        return "Url versioning version 2";
    }
}
