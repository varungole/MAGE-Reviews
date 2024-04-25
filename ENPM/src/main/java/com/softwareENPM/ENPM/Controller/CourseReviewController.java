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

import com.softwareENPM.ENPM.Entity.CourseReview;
import com.softwareENPM.ENPM.Service.CourseReviewService;

@RestController
@RequestMapping("api/course-reviews/v1")
public class CourseReviewController {
    
    @Autowired
    private CourseReviewService courseReviewService;

     @GetMapping
    public List<CourseReview> getAllCourses()
    {
        return courseReviewService.getCouurseReviews();
    }

    @GetMapping("/{id}")
    public CourseReview getProgramById(@PathVariable("id") Integer id)
    {
        return courseReviewService.getCourseReviewByID(id);
    }

    @PostMapping
    public CourseReview createProgram(@RequestBody CourseReview courseReview)
    {
        return courseReviewService.createCourseReview(courseReview);
    }

    @PutMapping("/{id}")
    public CourseReview updaCourseReview(@PathVariable("id") Integer id, @RequestBody CourseReview courseReview)
    {
        return courseReviewService.updateCourseReview(courseReview, id);
    }

    @DeleteMapping("/{id}")
    public void deleteProgram(@PathVariable("id") Integer id)
    {
        courseReviewService.deleteCourseReview(id);
    }
}
