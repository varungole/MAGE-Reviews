import React from 'react'
import { useNavigate } from 'react-router-dom'

function Software() {

  const navigate = useNavigate();

  const navigateTo = (URL) => {
    navigate(URL)
  }
  return (
    <div className='software-page'>
        <div className='program-reviers' onClick={() => {navigateTo('software-reviews')}}>Program reviews</div>
        <div className='admit-scores' onClick={() => {navigateTo('software-admits')}}>Admit chance and scores</div>
        <div className='courses' onClick={() => {navigateTo('software-courses')}}>Program courses</div>
        <div className='placements'>Placements</div>
    </div>
  )
}

export default Software