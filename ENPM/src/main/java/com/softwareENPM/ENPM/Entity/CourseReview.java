package com.softwareENPM.ENPM.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@Table(name = "T_COURSE_REVIEW")
@AllArgsConstructor
@NoArgsConstructor
public class CourseReview {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;
    
    @Column(name = "reviewerName")
    private String reviewerName;
    
    @Column(name = "comment")
    private String comment;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "CourseId") // Name of the column in T_COURSE table
    private Integer courseId;

    @Column(name = "ReviewDate")
    private LocalDate reviewDate;
}
