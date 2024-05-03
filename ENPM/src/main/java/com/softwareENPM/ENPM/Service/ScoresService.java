package com.softwareENPM.ENPM.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softwareENPM.ENPM.Entity.Scores;
import com.softwareENPM.ENPM.Repository.ScoresRepository;

@Service
public class ScoresService {
    
    @Autowired
    private ScoresRepository scoresRepository;

    public Scores createScore(Scores scores)
    {
        return scoresRepository.save(scores);
    }
    
    public List<Scores> getScores()
    {
        return scoresRepository.findAll();
    }

    public Scores getScoreById(Integer id)
    {
        return scoresRepository.findById(id).orElse(null);
    }

    public Scores updateScores(Scores scores, Integer id)
    {
        scores.setScoreId(id);
        return scoresRepository.save(scores);
    }

    public void deleteScores(Integer id)
    {
        scoresRepository.deleteById(id);
    }

    public void deleteAllScores()
    {
        scoresRepository.deleteAll();
    }
}
