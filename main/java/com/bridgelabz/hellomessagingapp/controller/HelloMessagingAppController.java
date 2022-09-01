package com.bridgelabz.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.*;
import com.bridgelabz.hellomessagingapp.controller.dto.User;

@RestController
@RequestMapping("/hello")
public class HelloMessagingAppController {

    //Url : http://localhost:8080/hello/getdata
    @GetMapping("/getdata")
    public String hello() {
        return "Hello Bridgelabz!";
    }

    //Url : http://localhost:8080/hello/query?name=Vishu
    @GetMapping("/query")
    public String querryParam(@RequestParam String name){
       return "Hello" + " " + name + " " + "from Bridgelabz";
    }

    //Url : http://localhost:8080/hello/path/Vishu
    @GetMapping("/path/{name}")
    public String nameParam(@PathVariable String name) {
        return "Hello" + " " + name + " " + "!";
    }

    //Url :  http://localhost:8080/hello/adduser
    @PostMapping("/adduser")
    public String addUser(@RequestBody User user) {
        return "Hello" + user.getFirstName() + " " + user.getLastName() +"!";
    }


    //Url : http://localhost:8080/hello/post?firstName=Vishangi&lastName=Dabir
    @PostMapping("/post")
    public String addUserRequestParam(@RequestParam String firstName, @RequestParam String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user.toString();
    }

    //Url : http://localhost:8080/hello/updated?firstName=Vishangi&lastName=Dabir
    @PutMapping("/updated")
    public String update(@RequestParam String firstName, @RequestParam String lastName) {
        User user = new User();
        user.setFirstName("Vishangi");
        user.setLastName("Dabir");
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user.toString();
    }

}
