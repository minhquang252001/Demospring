package com.example.Demospring.controller;

import com.example.Demospring.entity.StudentRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private List<StudentRequest> list = new ArrayList<StudentRequest>();

    @PostMapping("")
    public ResponseEntity<?> inser( StudentRequest studentRequest){
        list.add(studentRequest);
        return new ResponseEntity<>( list,HttpStatus.OK);
    }
    @PostMapping("/path/{name}/{age}")
    public ResponseEntity<?> insertPath(@PathVariable String name ,@PathVariable int age){
        StudentRequest studentRequest = new StudentRequest();
        studentRequest.setName(name);
        studentRequest.setAge(age);
        list.add(studentRequest);

        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @PostMapping("/body")
    public ResponseEntity<?> insertBody(@RequestBody StudentRequest studentRequest ){
        list.add(studentRequest);

        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
