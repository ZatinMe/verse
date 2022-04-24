package com.chimp.verse.controller;

import com.chimp.verse.controller.request.PostTest;
import com.chimp.verse.dto.TestDTO;
import com.chimp.verse.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= "*")
class TestCont {
    @Autowired private TestService testService;
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
    @PostMapping("/hello")
    public TestDTO helloPost(@RequestBody PostTest body) {
        return testService.testServiceFlow(body);
    }
}