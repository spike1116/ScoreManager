package com.example.scoremanager.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.scoremanager.entity.Course;
import com.example.scoremanager.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CourseService {

    @Autowired
    CourseMapper courseMapper;

    public List<Course> getAllCourse(){

        List<Course> courseList = courseMapper.selectList(null);
        return courseList;
    }

    public List<Course> searchCourse(Course course){

        QueryWrapper<Course> courseQueryWrapper = new QueryWrapper<>();
        courseQueryWrapper.like("c_name", course.getCName()).
                eq("c_credit", course.getCCredit()).
                eq("c_year", course.getCYear()).
                eq("c_semester", course.getCSemester()).
                like("t_id",course.getTId());
        return courseMapper.selectList(courseQueryWrapper);
    }
}
