package com.BeactEat.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hello")
class Helloworldcontroller {

    @GetMapping
    fun  sayHello():
            String ="Hello World!";
}