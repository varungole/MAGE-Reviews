package com.softwareENPM.ENPM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softwareENPM.ENPM.Entity.Review;
import com.softwareENPM.ENPM.Repository.ReviewRepository;

import java.util.List;

@Service
public class ReviewService {
    
    @Autowired
    private ReviewRepository reviewRepository;

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Integer id) {
        return reviewRepository.findById(id).orElse(null);
    }

    public Review updateReview(Review review, Integer id) {
        review.setReviewId(id);
        return reviewRepository.save(review);
    }

    public void deleteReview(Integer id) {
        reviewRepository.deleteById(id);
    }

    public void deleteAllReviews() {
        reviewRepository.deleteAll();
    }
}
