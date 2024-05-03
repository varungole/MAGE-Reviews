  import React, { useEffect, useState } from 'react';
  import axios from 'axios';
  import { useNavigate } from 'react-router-dom';
  
  function SoftwareAdmits() {
  
    const URL = "http://localhost:8080/api/scores/v1";
    const navigate = useNavigate();
    const [gre, setGRE] = useState('');
    const [toefl, setTOEFL] = useState('');
    const [workex, setWorkex] = useState('');
    const [name, setName] = useState('');



    const handleSubmit = (event) => {
      event.preventDefault();
      const programId = 1;

      const scoreData = {gre, toefl, workex, name, programId};

      axios.post(URL, scoreData)
      .then(response => {
        console.log(response.data)
        navigate('/software')
      })
      .catch(error => {
        console.log(error.message)
      })
    }


    const [scores, getScores] = useState([]);
    useEffect(() => {
      fetchScores();
    }, []);
    const fetchScores = async () => {
      try {
        const response = await axios.get(URL);
        getScores(response.data);
      } catch (error) {
        console.error('Error fetching reviews:', error);
      }
    };

    
    return (
      <div className="software-admits">
        <h2>Software Admissions</h2>

        <div className='admits-items'>
         {
          scores.map((score, index) => (
            <div key={index} className='score-template'>
              <h3 className='score-name'>{score.name}</h3>
              <p className='gre-score'>GRE: {score.gre}</p>
              <p className='toefl-score'>TOEFL: {score.toefl}</p>
              <p className='workex'>Work Experience: {score.workex}</p>
            </div>
          ))
         }

        </div>
        <div className='score'>
          <form className='score-form' onSubmit={handleSubmit}>

            <label className='name'>Enter your name</label>
            <input className='name-input' required type='text' value={name} onChange={(e) => setName(e.target.value)}></input>

            <label className='gre'>GRE</label>
            <input className='GRE-Input' required type='text' value={gre} onChange={(e) => {setGRE(e.target.value)}}></input>

            <label className='Toefl'>TOEFL</label>
            <input className='toefl-input' required type='text' value={toefl} onChange={(e) => {setTOEFL(e.target.value)}}></input>

            <label className='Workex' required type='text' value={workex} onChange={(e) => {setWorkex(e.target.value)}}>Enter your workex years</label>
            <input className='toefl-input' type='text' required value={workex} onChange={(e) => {setWorkex(e.target.value)}}></input>

            <button type='submit' className='submit-button-admits'>Submit</button>
          </form>
          </div>
      </div>
    );
  }

  export default SoftwareAdmits;
