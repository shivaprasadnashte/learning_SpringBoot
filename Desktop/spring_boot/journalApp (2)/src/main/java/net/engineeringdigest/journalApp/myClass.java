package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class myClass {

    @GetMapping("hello")
    public String sayHelloo(){
        return "Hello World !";
    }
}
