import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

function SoftwareReviews() {

  const[reviews, setReviews] = useState([]);
  const URL = 'http://localhost:8080/api/reviews/v1';
  
  const fetchReviews = async () => {
    try {
      const response = await axios.get(URL);
      const filteredData = response.data.filter(review => review.programId === 1);
      setReviews(filteredData);
    } catch (error) {
      console.error('Error fetching reviews:', error);
    }
  }

  const navigate = useNavigate();

  const navigateTo = (link) => {
    navigate(link);
  }

  useEffect(() => {fetchReviews();}, []);
  
  return (
    <div className="software-reviews">
      <h2>Software Reviews</h2>
      {reviews.map((review, index) => (
                    <div key={index} className='reviewer-value'>
                         <div className="reviewer">
                    <p className='reviewer-name'>{review.reviewerName}</p>
                   </div>
                   <div className="review-content">
          <p>{review.comment}</p>
        </div>

                    </div>
                ))}
     <div className='submit-a-review'>
        <button className='review-button' onClick={() => {navigateTo('/submit-review')}}>Submit a Review!</button>
     </div>
    </div>
  );
}

export default SoftwareReviews;
