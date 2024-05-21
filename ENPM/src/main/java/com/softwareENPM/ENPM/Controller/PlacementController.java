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

import com.softwareENPM.ENPM.Entity.Placement;
import com.softwareENPM.ENPM.Service.PlacementService;


@RestController
@RequestMapping("/api/placements/v1")
public class PlacementController {
    
    @Autowired
    private PlacementService placementService;

    @GetMapping
    public List<Placement> getAllPlacements()
    {
        return placementService.getPlacements();
    }

    @GetMapping("/{id}")
    public Placement getPlacementById(@PathVariable Integer id)
    {
        return placementService.findPlacementById(null);
    }

    @PostMapping
    public Placement createPlacement(@RequestBody Placement placement)
    {
        return placementService.createPlacement(placement);
    }

    @PutMapping
    public Placement updatePlacement(@RequestBody Placement placement, @PathVariable Integer id)
    {
        return placementService.updatePlacement(placement, id);
    }

    @DeleteMapping
    public void deletePlacement(@PathVariable Integer id)
    {
        placementService.deletePlacement(id);
    }
 
}

