package com.softwareENPM.ENPM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softwareENPM.ENPM.Entity.Program;
import com.softwareENPM.ENPM.Entity.Review;
import com.softwareENPM.ENPM.Repository.ProgramRepository;
import java.util.*;

@Service
public class ProgramService  {
    
      @Autowired
      private ProgramRepository programRepository;

      public Program createProgram(Program program)
      {
        return programRepository.save(program);
      }

      public List<Program> getAllPrograms()
      {
        return programRepository.findAll();
      }

      public Program getProgramById(Integer id)
      {
        return programRepository.findById(id).orElse(null);
      }

      public Program updateProgram(Program program, Integer id)
      {
         program.setProgramId(id);
         return programRepository.save(program);
      }

      public void deleteProgram(Integer id)
      {
           programRepository.deleteById(id);
      }

      public List<Review> getReviewsById(Integer id)
      {
        Program program = programRepository.findById(id).orElse(null);
        return program.getReviews();
      }
      
}
