package edu.csumb.cst438.bholland.lectures.microservices.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller
@SpringBootApplication
public class MicroservicesApplication {

	@RequestMapping("/")
    @ResponseBody
    String home(){
	    return "Hello World! I am potato.";
    }

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApplication.class, args);
	}
}
