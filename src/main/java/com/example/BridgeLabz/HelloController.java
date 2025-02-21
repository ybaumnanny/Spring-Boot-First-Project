package com.example.BridgeLabz;
import com.example.BridgeLabz.UserDto.UserDTO;
import org.springframework.web.bind.annotation.*;

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
//    UC3-RestCall_To_BridegLabz
@RequestMapping("hello/param/{name}")
public String sayHelloWithPathVariable(@PathVariable String name) {
    return "Hello " + name + " from BridgeLabz";
}
// UC4-RestCall_To_Show_MarkTaylor
@PostMapping("/post")
public String sayHello(@RequestBody UserDTO user) {
    return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
}
}
