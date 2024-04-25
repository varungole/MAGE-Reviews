import React, { useEffect, useState } from 'react';
import axios from 'axios';

function SoftwareCourses() {
  const [courses, setCourses] = useState([]);
  const URL = 'http://localhost:8080/api/courses/v1';

  useEffect(() => {
    fetchCourses();
  }, []);

  const fetchCourses = async () => {
    try {
      const response = await axios.get(URL);
      setCourses(response.data);
    } catch (error) {
      console.error('Error fetching reviews:', error);
    }
  };

  return (
    <div className='software-courses'>
      <div className='software-courses-list'>
        {courses.map((course, index) => (
          <div key={index} className='course'>
            <h2 className='course-name'>{course.courseName}</h2>
            <p className='professor'>Professor: {course.professor}</p>
            <p className='TA'>TA: {course.ta}</p>
            <p className='grader'>Grader: {course.grader}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default SoftwareCourses;
