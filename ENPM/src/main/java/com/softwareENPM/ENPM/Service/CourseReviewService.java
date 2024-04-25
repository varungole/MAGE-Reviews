package com.softwareENPM.ENPM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softwareENPM.ENPM.Entity.CourseReview;
import com.softwareENPM.ENPM.Repository.CourseReviewRepository;
import java.util.*;

@Service
public class CourseReviewService {
    
    @Autowired
    private CourseReviewRepository courseReviewRepository;

    public CourseReview createCourseReview(CourseReview courseReview)
    {
        return courseReviewRepository.save(courseReview);
    }

    public List<CourseReview> getCouurseReviews()
    {
        return courseReviewRepository.findAll();
    }

    public CourseReview getCourseReviewByID(Integer id)
    {
        return courseReviewRepository.findById(id).orElse(null);
    }

    public CourseReview updateCourseReview(CourseReview courseReview, Integer id)
    {
        courseReview.setCourseId(id);
        return courseReviewRepository.save(courseReview);
    }

    public void deleteCourseReview(Integer id)
    {
        courseReviewRepository.deleteById(id);
    }
}
