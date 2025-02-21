package com.example.BridgeLabz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    UC1-Hello_From_BridgeLabz
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz.";
    }
//    UC2-Hello_Mark_From_BridgeLabz
    @RequestMapping("/hello/query")
    public String greetUser(@RequestParam String name){
        return "Hello " + name + " From BridgeLabz";
}



}
