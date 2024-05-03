package com.softwareENPM.ENPM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softwareENPM.ENPM.Entity.Scores;

@Repository
public interface ScoresRepository extends JpaRepository<Scores, Integer>{
    
}
