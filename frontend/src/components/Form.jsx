import React, { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

function Form() {
  const [name, setName] = useState('');
  const [review, setReview] = useState('');
  const navigate = useNavigate();

  const handleSubmit = (event) => {
    event.preventDefault(); // Prevent default form submission behavior

    const URL = 'http://localhost:8080/api/reviews/v1';
    const formData = { name, review };

    axios.post(URL, formData)
      .then(response => {
        console.log(response.data);
        navigate('/software'); // Navigate on successful submission
      })
      .catch(error => {
        console.log(error);
        // Optionally handle error differently, maybe display a message to the user
      });
  }

  return (
    <form className='review-form' onSubmit={handleSubmit}>
      <label className='review-label'>Enter your name</label>
      <input 
        className='review-name-input'
        required 
        type='text' 
        placeholder='Leave blank for anonymous'
        value={name} 
        onChange={(e) => setName(e.target.value)}
      />
      
      <label className='review-label'>Write your honest review</label>
      <input 
        className='review-name-input'
        required 
        type='text'
        value={review} 
        onChange={(e) => setReview(e.target.value)}
      />
      <button type='submit' className='form-button'>Submit</button>
    </form>
  );
}

export default Form;
