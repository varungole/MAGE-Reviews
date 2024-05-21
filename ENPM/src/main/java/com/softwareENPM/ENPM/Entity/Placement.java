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
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_SOFTWARE_PLACEMENTS")
public class Placement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer placementId;
    
    @Column(name = "programId")
    private String programId;

    @Column(name = "placement_name", nullable = false, length = 100)
    private String name;
    
    private String companyName;
}
