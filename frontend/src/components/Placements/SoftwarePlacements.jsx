import axios from 'axios';
import React, { useEffect, useState} from 'react'
import { useNavigate } from 'react-router-dom'


function SoftwarePlacements() {

  const [placements, setPlacements] = useState([]);
  const URL = 'http://localhost:8080/api/placements/v1';

  useEffect(() => {
    fetchPlacements();
  }, []);

  const fetchPlacements = async () => {
    try {
      const response = await axios.get(URL);
      setPlacements(response.data);
      console.log(response.data);
    } catch(error) {
      console.error('Error fetching placements' , error);
    }
  }

  const navigate = useNavigate();

  const navigateTo = (URL) => {
    navigate(URL);
  }

  return (
    <div className='software-placements'>
      <div className='placement-list'>
        {placements.map((placement, index) => (
          <div key={index} className='placement'>
            <h2 className='name'>{placement.name}</h2>
            <h2 className='companyName'>{placement.companyName}</h2>
            </div>
        ))}
      </div>

      <div className='got-a-placement'>Got a placement?
      <button className='submit-placement' onClick={() => navigateTo('/submit-software-placement')}>Submit details!</button></div>
    </div>
  )
}

export default SoftwarePlacements