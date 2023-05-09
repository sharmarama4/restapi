package com.restfullapi.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    //Spring mvc internally uses MappingJackson2HttpMessageConverter
    //this convert java object to json and json to java object
    @GetMapping("/student")//to access this url
    // you can write this url like this( @GetMapping(path="/student"))
    //this is to return the single object to the client
    public Student getStudent() {
        return new Student("Rama", "Sharma");


    }

    //this to return the list of object to the client
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ramesh", "Fardery"));
        students.add(new Student("Tony", "sharma"));
        students.add(new Student("Raj", "sha"));
        students.add(new Student("Shan", "Sing"));
        students.add(new Student("Cena", "Jadhav"));
        return students;

    }

    //http://localhost:8080/student/ramesh/fadatare
    //this handle the path variable
    @GetMapping("student/{firstName}/{lastname}")//this is called uri template variable
    public Student studentPathVariable(@PathVariable("firstName") String firstName, @PathVariable("lastname") String lastName) {
        return new Student(firstName, lastName);
    }

    //build rest api to handel query parameters
    //http://localhost:8080/student?firstName=Ramesh & lastName=Fardery(this is the query parameter)// see diff betwn @path vari and @
    @GetMapping("/student/query")//this is called uri template variable
    public Student studentQueryParam(@RequestParam(name = "firstName") String firstName,
                                     @RequestParam(name = "lastname") String lastName) {
        return new Student(firstName, lastName);
    }
}
