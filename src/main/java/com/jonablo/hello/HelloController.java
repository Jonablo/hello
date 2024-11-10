package com.jonablo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
<<<<<<< HEAD
        return "Hello world [Java]";
=======
        return "Hello World";
>>>>>>> b6909e2945b47135a0b78f753a92911508e47111
    }
}
