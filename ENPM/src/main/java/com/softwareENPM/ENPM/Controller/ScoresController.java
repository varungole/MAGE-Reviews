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
import java.util.*;
import com.softwareENPM.ENPM.Entity.Scores;
import com.softwareENPM.ENPM.Service.ScoresService;

@RestController
@RequestMapping("api/scores/v1")
public class ScoresController {
    
    @Autowired
    private ScoresService scoresService;

    @GetMapping
    public List<Scores> getScores()
    {
         return scoresService.getScores();
    }

    @GetMapping("/{id}")
    public Scores getScoreById(@PathVariable Integer id)
    {
        return scoresService.getScoreById(id);
    }
    
    @PostMapping
    public Scores createScore(@RequestBody Scores score)
    {
        return scoresService.createScore(score);
    }

    @PutMapping("/{id}")
    public Scores updateScore(@PathVariable Integer id, @RequestBody Scores score)
    {
        return scoresService.updateScores(score, id);
    }

    @DeleteMapping("/{id}")
    public void deleteScoreById(@PathVariable Integer id)
    {
        scoresService.deleteScores(id);
    }

    @DeleteMapping
    public void deleteScores()
    {
        scoresService.deleteAllScores();
    }
    

    
    
}
