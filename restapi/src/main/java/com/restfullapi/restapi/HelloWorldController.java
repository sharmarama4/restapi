package com.restfullapi.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//instead of these two annotations we can use @Controller and @responseBody annotations)

public class HelloWorldController {
    //get
    //post
    //put
    //delete(we use api and they should return the format as json or xml to the client)
    // to handle the  Get Http Methode we use GetMapping
    //http://localhost:8080/hello(to see on the webpage and this sent the string to the client )
@GetMapping("/hello")// this is the url
    public String helloWorld(){
    return "HelloWorld";
}
}
