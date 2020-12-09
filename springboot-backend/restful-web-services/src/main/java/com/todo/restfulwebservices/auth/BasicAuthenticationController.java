package com.todo.restfulwebservices.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//can handle rest requests
@CrossOrigin()
@RestController
public class BasicAuthenticationController {
    //GET
    //URI - /hello-world
    //method - "hello world"
    //GET request mapping

//    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
//    public String helloWorld() {
//        return "Hello World";
//    }

    //when you go to /hello-world and perform a get request
    //hello world is returned to the browser
//    @GetMapping(path = "/hello-world")
//    public String helloWorld() {
//        return "Hello World";
//    }
//
//    @GetMapping(path="/hello-world-bean")
//    public HelloWorldBean helloWorldBean() {
//        return new HelloWorldBean("Hello world");
//    }

    //authentication path
    @GetMapping(path="/basicauth")
    public AuthenticationBean helloWorldPath() {
        return new AuthenticationBean("You are authenticated");
    }
}