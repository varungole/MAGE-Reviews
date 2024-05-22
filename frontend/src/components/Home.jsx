import React, { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import axios from "axios";

import Software from '../images/software.jpeg';
import Robotics from '../images/robotics.jpeg';

import Mechanical from '../images/mechanical.jpeg';
import Cybersecurity from '../images/Cybersec.jpeg';

function Home() {
    const [programs, setPrograms] = useState([]);
    const navigate = useNavigate();

    const fetchPrograms = async () => {
        try {
            const response = await axios.get('http://localhost:8080/api/programs/v1');
            setPrograms(response.data);
        } catch (error) {
            console.error('Error fetching programs:', error);
        }
    }

    useEffect(() => {
        fetchPrograms();
    }, []);

    const navigateTo = (url) => {
        navigate(url);
    }

    const URL = ['/software', '/robotics', '/cybersecurity', '/mechanical']

    const IMAGES = [Software, Robotics, Cybersecurity, Mechanical];

    return (
        <div className='home-page'>
            <div className='program'>
                {programs.map((program, index) => (
                    <div key={index} className='program-value' onClick={() => navigateTo(URL[index])}>
                        
                        <img className='image' src={IMAGES[index]} alt={`${program.name}-logo`} />
                        <h3 className='program-title'>{program.programName}</h3>
                    </div>
                ))}
            </div>
            <div className='terminal'>
                <button className='terminal-button' onClick={() => navigateTo('/market-home')}>Go to market!</button>
            </div>
        </div>
    )
}

export default Home;
