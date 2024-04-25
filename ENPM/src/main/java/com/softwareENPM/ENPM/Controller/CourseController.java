package com.softwareENPM.ENPM.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.softwareENPM.ENPM.Entity.Course;
import com.softwareENPM.ENPM.Entity.CourseReview;
import com.softwareENPM.ENPM.Service.CourseService;

@RestController
@RequestMapping("api/courses/v1")
public class CourseController {
    
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses()
    {
        return courseService.getCourse();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable("id") Integer id)
    {
        return courseService.getCourseById(id);
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course)
    {
        return courseService.createCourse(course);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable("id") Integer id, @RequestBody Course course)
    {
        return courseService.updateCourse(course, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable("id") Integer id)
    {
        courseService.deleteCourse(id);
    }

    @GetMapping("/{id}/course-reviews")
    public List<CourseReview> getReviewsByID(@PathVariable("id") Integer id)
    {
        return courseService.getCoursesReviews(id);
    }
}
