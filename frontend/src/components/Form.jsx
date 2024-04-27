import React from 'react'

function Form() {
  return (
    <div className='review-form'>
      <label className='review-label'>Enter your name</label>
      <input className='review-name-input'required type='text' placeholder='..anoynmous if dont want to reveal'></input>
      <label className='review-label'>Write your honest reviewe</label>
      <input className='review-name-input' required type='text'></input>
      <button type='submit' className='form-button'>Submit</button>
    </div>
  )
}

export default Form