package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer, Student> db = new HashMap<>() ;

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
        return db.get(regNo) ;
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        db.put(student.getRegNo(), student);
        return "Student is added successfully";
    }

    @GetMapping("/getByPath/{id}")
    public Student getStudentUsingPath(@PathVariable("id") int regNo){
        return db.get(regNo) ;
    }

    @PutMapping("/updateAge/{id}")
    public Student updateAge(@PathVariable("id") int regNo, @RequestParam("q") int newAge) {
        db.get(regNo).setAge(newAge);
        return db.get(regNo) ;
    }
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam("q") int regNo){
        db.remove(regNo);
        return "Student is deleted successfully" ;
    }
}
