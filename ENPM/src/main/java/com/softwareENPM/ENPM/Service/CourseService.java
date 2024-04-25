package com.softwareENPM.ENPM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softwareENPM.ENPM.Entity.Course;
import com.softwareENPM.ENPM.Entity.CourseReview;
import com.softwareENPM.ENPM.Repository.CourseRepository;
import java.util.*;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository courseRepository;

    public Course createCourse(Course course)
    {
        return courseRepository.save(course);
    }

    public List<Course> getCourse()
    {
        return courseRepository.findAll();
    }

    public Course getCourseById(Integer id)
    {
        return courseRepository.findById(id).orElse(null);
    }

    public Course updateCourse(Course course, Integer id)
    {
        course.setCourseId(id);
        return courseRepository.save(course);
    }

    public void deleteCourse(Integer id)
    {
        courseRepository.deleteById(id);
    }

    public List<CourseReview> getCoursesReviews(Integer id)
    {
        Course course = courseRepository.findById(id).orElse(null);
        return course.getCourseReviews();
    }

}
