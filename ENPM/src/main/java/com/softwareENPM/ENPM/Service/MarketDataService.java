package com.softwareENPM.ENPM.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softwareENPM.ENPM.Entity.MarketData;
import com.softwareENPM.ENPM.Repository.MarketDataRepository;
import java.util.*;

@Service
public class MarketDataService {
    

    @Autowired
    private MarketDataRepository marketDataRepository;

    public void saveOrUpdate(String symbol, double price)
    {
        MarketData marketData = marketDataRepository.findFirstBySymbolOrderByTimestampDesc(symbol);
        if(marketData != null)
        {
        marketData.setPrice(price);
        marketData.setTimestamp(LocalDateTime.now());
        marketDataRepository.save(marketData);
        } else {
        MarketData marketData2 = new MarketData();
        marketData2.setPrice(price);
        marketData2.setSymbol(symbol);
        marketData2.setTimestamp(LocalDateTime.now());
        marketDataRepository.save(marketData2);
        }
    }

    public void delete()
    {
        marketDataRepository.deleteAll();
    }

    public List<MarketData> getAllMarketData()
    {
        return marketDataRepository.findAll();
    }

    public MarketData getLatestMarketData(String symbol)
    {
        return marketDataRepository.findFirstBySymbolOrderByTimestampDesc(symbol);
    }

    
}
