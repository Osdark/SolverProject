package com.ddd.reactiveweb;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api")
@CrossOrigin(value = "*", allowCredentials = "true")
public class PruebaController {

    @GetMapping()
    public Mono<String> getMessage(){
        return Mono.just("Holaaa");
    }

}
