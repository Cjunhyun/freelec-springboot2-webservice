package com.jojoldu.boo.springboot.web;

import com.jojoldu.boo.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amout) {
        return new HelloResponseDto(name, amout);
    }
}
