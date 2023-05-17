package com.example.scoremanager.controller;

import com.example.scoremanager.Service.CourseService;
import com.example.scoremanager.entity.Course;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/allcourse")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

    @PostMapping("/searchCourse")
    public List<Course> searchCourse(@RequestBody Course course){
        return new ArrayList<>();
    }
}
