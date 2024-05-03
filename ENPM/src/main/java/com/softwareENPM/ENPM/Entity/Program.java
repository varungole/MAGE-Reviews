package com.softwareENPM.ENPM.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T_PROGRAM")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Program {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer programId;
    
    @Column(name = "program_name", nullable = false, length = 255) 
    private String programName;

    @OneToMany(mappedBy = "programId")
    private List<Review> reviews;

    @OneToMany(mappedBy = "programId")
    private List<Course> courses;

    @OneToMany(mappedBy = "programId")
    private List<Scores> scores;

}
