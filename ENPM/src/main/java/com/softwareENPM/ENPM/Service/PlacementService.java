package com.softwareENPM.ENPM.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softwareENPM.ENPM.Entity.Placement;
import com.softwareENPM.ENPM.Repository.PlacementRepository;

@Service
public class PlacementService {
    

    @Autowired
    private PlacementRepository placementRepository;

    public Placement createPlacement(Placement placement)
    {
        return placementRepository.save(placement);
    }

    public List<Placement> getPlacements()
    {
        return placementRepository.findAll();
    }

    public Placement findPlacementById(Integer id)
    {
        return placementRepository.findById(id).orElse(null);
    }

    public Placement updatePlacement(Placement placement, Integer id)
    {
        placement.setPlacementId(id);
        return placementRepository.save(placement);
    }

    public void deletePlacement(Integer id)
    {
        placementRepository.deleteById(id);
    }
}
