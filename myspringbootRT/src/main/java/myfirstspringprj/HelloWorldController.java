package myfirstspringprj;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    String hello() {
        return "Hello World!";
    }

    @RequestMapping("/name")
    String name() {
        return "Hello Pasha!";
    }


}
