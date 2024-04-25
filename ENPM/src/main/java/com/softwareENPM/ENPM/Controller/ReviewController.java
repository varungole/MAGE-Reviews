package com.softwareENPM.ENPM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softwareENPM.ENPM.Entity.Review;
import com.softwareENPM.ENPM.Service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("api/reviews/v1")
public class ReviewController {
    
    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable("id") Integer id) {
        return reviewService.getReviewById(id);
    }

    @PostMapping
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }

    @PutMapping("/{id}")
    public Review updateReview(@PathVariable("id") Integer id, @RequestBody Review review) {
        return reviewService.updateReview(review, id);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable("id") Integer id) {
        reviewService.deleteReview(id);
    }
}
