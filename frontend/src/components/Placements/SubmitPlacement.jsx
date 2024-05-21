import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
import axios from 'axios';

function SubmitPlacement() {
    const URL = 'http://localhost:8080/api/placements/v1';
    const navigate = useNavigate();

    const [name, setName] = useState('');
    const [companyName, setCompanyName] = useState('');
    

    const handleSubmit = (e) => {
        e.preventDefault();
        const programId = 1;

        const placementData = {name, companyName, programId};

        axios.post(URL, placementData)
        .then(response => {
            navigate('/software')
        })
        .catch(error => {
            console.log(error.message)
        })
    }

  return (
    <div className='placment'>
        <form className='placement-form' onSubmit={handleSubmit}>
        <label className='name'>Enter your name</label>
            <input className='name-input' required type='text' value={name} onChange={(e) => setName(e.target.value)}></input>

            <label className='company-name'>Enter your company name</label>
            <input className='company-input' required type='text' value={companyName} onChange={(e) => {setCompanyName(e.target.value)}}></input>
       
            <button type='submit' className='submit-button-placements'>Submit</button>

        </form>
    </div>
  )
}

export default SubmitPlacement