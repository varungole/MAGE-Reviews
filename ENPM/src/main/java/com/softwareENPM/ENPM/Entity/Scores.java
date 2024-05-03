package com.softwareENPM.ENPM.Entity;

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
@Table(name = "T_SCORES")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Scores {
    
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer scoreId;

      @Column(name = "Name")
      private String name;

      @Column(name = "gre")
      private Integer GRE;
      
      @Column(name = "toefl")
      private Integer TOEFL;
      
      @Column(name = "Years")
      private Integer workex;

      @Column(name = "programId")
      private Integer programId;
      
}
