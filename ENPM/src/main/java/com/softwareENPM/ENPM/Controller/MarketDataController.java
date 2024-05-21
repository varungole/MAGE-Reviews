package com.softwareENPM.ENPM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softwareENPM.ENPM.Entity.MarketData;
import com.softwareENPM.ENPM.Service.MarketDataService;
import java.util.*;

@RestController
@RequestMapping("/api/market/v1")
public class MarketDataController {
    
    @Autowired
    private MarketDataService marketDataService;

    @PostMapping
    public void addData(@RequestParam String symbol, @RequestParam double price)
    {
        marketDataService.saveOrUpdate(symbol, price);
    }
    
    @GetMapping
    public List<MarketData> marketData()
    {
        return marketDataService.getAllMarketData();
    }

    @GetMapping("/latest/{symbol}")
    public MarketData getLatest(@PathVariable String symbol)
    {
            return marketDataService.getLatestMarketData(symbol);
    }

    @DeleteMapping
    public void delete()
    {
        marketDataService.delete();
    }


}
