package com.softwareENPM.ENPM.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softwareENPM.ENPM.Entity.Program;
import com.softwareENPM.ENPM.Entity.Review;
import com.softwareENPM.ENPM.Service.ProgramService;

@RestController
@RequestMapping("api/programs/v1")
public class ProgramController {
    
    @Autowired
    private ProgramService programService;

    @GetMapping
    public List<Program> getAllPrograms()
    {
        return programService.getAllPrograms();
    }

    @GetMapping("/{id}")
    public Program getProgramById(@PathVariable("id") Integer id)
    {
        return programService.getProgramById(id);
    }

    @PostMapping
    public Program createProgram(@RequestBody Program program)
    {
        return programService.createProgram(program);
    }

    @PutMapping("/{id}")
    public Program updateProgram(@PathVariable("id") Integer id, @RequestBody Program program)
    {
        return programService.updateProgram(program, id);
    }

    @DeleteMapping("/{id}")
    public void deleteProgram(@PathVariable("id") Integer id)
    {
        programService.deleteProgram(id);
    }

    @GetMapping("/{id}/reviews")
    public List<Review> getReviewsByID(@PathVariable("id") Integer id)
    {
        return  programService.getReviewsById(id);
    }
}
