package pl.altkom.springboot.lab01.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/versioning/header/accept")
@RestController
public class VersioningAcceptHeaderController {

    @GetMapping(produces = "application/vnd.hello.versioning-v1+json")
    public String versioningV1() {
        return "Accept header versioning version 1";
    }

    @GetMapping(produces = "application/vnd.hello.versioning-v2+json")
    public String versioningV2() {
        return "Accept header versioning version 2";
    }
}
