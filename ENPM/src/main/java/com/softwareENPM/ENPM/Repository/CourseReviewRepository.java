package com.softwareENPM.ENPM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softwareENPM.ENPM.Entity.CourseReview;

@Repository
public interface CourseReviewRepository extends JpaRepository<CourseReview, Integer>{
    
}
