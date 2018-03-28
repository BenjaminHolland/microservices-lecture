package edu.csumb.cst438.bholland.lectures.microservices.microservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KittensService {
    @RequestMapping("/kittens")
    @ResponseBody
    String getKittens(){
        return "Kitties!";
    }
}
