  import React, { useState } from 'react';

  function SoftwareAdmits() {

    const handleSubmit = () => {

    }

    const [GRE, setGRE] = useState('');
    const [TOEFL, setTOEFL] = useState('');
    const [workex, setWorkex] = useState('');
    const [name, setName] = useState('');

    
    return (
      <div className="software-admits">
        <h2>Software Admissions</h2>

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
        <div className='score'>
          <form className='score-form' onSubmit={handleSubmit}>

            <label className='name'>Enter your name</label>
            <input className='name-input' required type='text' value={name} onChange={(e) => setName(e.target.value)}></input>

            <label className='gre'>GRE</label>
            <input className='GRE-Input' required type='text' value={GRE} onChange={(e) => {setGRE(e.target.value)}}></input>

            <label className='Toefl'>TOEFL</label>
            <input className='toefl-input' required type='text' value={TOEFL} onChange={(e) => {setTOEFL(e.target.value)}}></input>

            <label className='Workex' required type='text' value={workex} onChange={(e) => {setWorkex(e.target.value)}}>Enter your workex years</label>
            <input className='toefl-input' type='text' required value={workex} onChange={(e) => {setWorkex(e.target.value)}}></input>

            <button type='submit' className='submit-button-admits'>Submit</button>
          </form>
          </div>
      </div>
    );
  }

  export default SoftwareAdmits;
