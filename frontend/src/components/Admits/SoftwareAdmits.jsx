  import React, { useState } from 'react';

  function SoftwareAdmits() {

    const handleSubmit = () => {

    }

    const [GRE, setGRE] = useState('');
    const [TOEFL, setTOEFL] = useState('');
    const [workex, setWorkex] = useState('');
    
    return (
      <div className="software-admits">
        <h2>Software Admissions</h2>
        <div className="admit-category">
          <h3>GRE Score</h3>
          <p>Average GRE score for admitted students: 325</p>
        </div>
        <div className="admit-category">
          <h3>TOEFL Score</h3>
          <p>Average TOEFL score for admitted students: 105</p>
        </div>
        <div className="admit-category">
          <h3>Work Experience</h3>
          <p>Average years of work experience for admitted students: 2.5</p>
        </div>

        <div className='admits-items'>
          <div className='admit-item'>
              <h3 className='admit-name'>Name</h3>
              <h3 className='TOEFL'>108</h3>
              <h3 className='GRE'>322</h3>
          </div>
          <div className='admit-item'>
              <h3 className='admit-name'>Name</h3>
              <h3 className='TOEFL'>107</h3>
              <h3 className='GRE'>309</h3>
          </div>
          <div className='admit-item'>
              <h3 className='admit-name'>Name</h3>
              <h3 className='TOEFL'>107</h3>
              <h3 className='GRE'>311</h3>
          </div>
          <div className='admit-item'>
              <h3 className='admit-name'>Name</h3>
              <h3 className='TOEFL'>109</h3>
              <h3 className='GRE'>315</h3>
          </div>

        </div>
        <div className='score'>Enter your score !
          <form className='score-form' onSubmit={handleSubmit}>
            <label className='gre'>GRE</label>

            <input className='GRE-Input' required type='text' value={GRE} onChange={(e) => {setGRE(e.target.value)}}></input>

            <label className='Toefl'>TOEFL</label>
            <input className='toefl-input' required type='text' value={TOEFL} onChange={(e) => {setTOEFL(e.target.value)}}></input>

            <label className='Workex' required type='text'>TOEFL</label>
            <input className='toefl-input' type='text' value={TOEFL} onChange={(e) => {setTOEFL(e.target.value)}}></input>

            <label className='Workex' required type='text' value={workex} onChange={(e) => {setWorkex(e.target.value)}}>Enter your workex years</label>
            <input className='toefl-input' type='text' required value={workex} onChange={(e) => {setWorkex(e.target.value)}}></input>

            <button type='submit'></button>
          </form>
          </div>
      </div>
    );
  }

  export default SoftwareAdmits;
