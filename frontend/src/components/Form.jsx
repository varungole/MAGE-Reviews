import React, { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

function Form() {
  const [reviewerName, setName] = useState('');
  const [comment, setReview] = useState('');
  const [rating, setRating] = useState('');


  const navigate = useNavigate();

  const handleSubmit = (event) => {
    event.preventDefault(); // Prevent default form submission behavior

    const URL = 'http://localhost:8080/api/reviews/v1';
    const programId = 1;
    const reviewDate = new Date().toISOString(); // Use ISO string for universal date format compatibility

    const formData = { reviewerName, comment, rating, programId, reviewDate};

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
        value={reviewerName} 
        onChange={(e) => setName(e.target.value)}
      />
      
      <label className='review-label'>Write your honest review</label>
      <input className='review-input' required type='text' value={comment} onChange={(e) => setReview(e.target.value)}></input>

      <label className='review-rating'>Give rating out of 5</label>
      <input className='review-rating-input' required type='number' value={rating} onChange={(e) => setRating(e.target.value)}></input>
      <button type='submit' className='form-button'>Submit</button>
    </form>
  );
}

export default Form;
