package com.softwareENPM.ENPM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softwareENPM.ENPM.Entity.MarketData;


@Repository
public interface MarketDataRepository extends JpaRepository<MarketData, Integer> {
    MarketData findFirstBySymbolOrderByTimestampDesc(String symbol);
}
