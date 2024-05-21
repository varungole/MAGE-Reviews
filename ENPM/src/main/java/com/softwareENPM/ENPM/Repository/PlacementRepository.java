package com.softwareENPM.ENPM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softwareENPM.ENPM.Entity.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Integer> {
    
}
