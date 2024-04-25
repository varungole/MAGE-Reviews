package com.softwareENPM.ENPM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softwareENPM.ENPM.Entity.Program;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Integer>{
    
}
