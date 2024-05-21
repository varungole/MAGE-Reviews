import React, { useEffect, useState } from 'react'
import axios from 'axios';

function MarketMain() {

  const URL = 'http://localhost:8080/api/market/v1';

  const [marketData, setMarketData] = useState([]);
  
  const fetchData = async() => {
    try {
      const response = await axios.get('http://localhost:8080/api/market/v1');
      setMarketData(response.data);
      console.log(marketData);
  } catch (error) {
      console.error('Error fetching programs:', error);
  }
  }

  useEffect(() => {
    fetchData()
  }, []);

  return (
    <div className='stock-all'>
      {marketData.map((stock, index) => (
        <div className='stock-frame' key={index}>
        <h1 className='stock-name'>{stock.symbol}</h1>
        <h4 className='stock-price'>{stock.price}</h4>
        <input type='number' className='stock-quantity'></input>
        <button className='purchase'>Buy</button>
        </div>
      ))}
    </div>
  )
}

export default MarketMain