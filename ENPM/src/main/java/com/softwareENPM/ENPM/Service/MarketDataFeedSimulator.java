package com.softwareENPM.ENPM.Service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MarketDataFeedSimulator {
    
    @Autowired
    private MarketDataService marketDataService;

    private final Random random = new Random();

    @Scheduled(fixedRate = 10000)
    public void generatedMarketData()
    {
        String[] symbols = {"APPLE", "AMZN", "GOOGL", "IBM", "NTFLX", "IBKR", "QUORUM"};
        for(String symbol : symbols)
        {
            double price = 100 + (random.nextDouble()* 900);
            marketDataService.saveOrUpdate(symbol, price);
        }
    }

}
