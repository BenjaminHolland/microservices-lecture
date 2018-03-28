package edu.csumb.cst438.bholland.lectures.microservices.microservices.kittens;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KittensService {
    @RequestMapping("/kittens")
    @ResponseBody
    KittensData getKittens(){
        return new KittensData("Cat!",400);
    }
}
