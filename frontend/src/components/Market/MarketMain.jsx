import React from 'react'

function MarketMain() {

  const stocks = ["APPLE", "AMZN", "GOOGL", "IBM", "NTFLX", "IBKR", "QUORUM"];
  return (
    <div className='stock-all'>
      {stocks.map((stock, index) => (
        <div className='stock-frame' key={index}>
        <h1 className='stock-name'>{stocks[index]}</h1>
        <h4 className='stock-price'>500</h4>
        <button className='purchase'>Buy</button>
        </div>
      ))}
    </div>
  )
}

export default MarketMain