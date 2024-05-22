import React, { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

function Login() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');

  const navigate = useNavigate();
  const API_URL = 'http://localhost:8080/api/users/v1/1';
  const navigateTo = (URL) => {
    navigate(URL);
  }

  const handleSubmit = async (e) => {
    e.preventDefault();

    if (!username || !password) {
      setError('Please enter both username and password.');
      return;
    }

    try {
      const response = await axios.get('http://localhost:8080/api/users/v1');
      const users = response.data;

      const authenticatedUser = users.find(user => user.username === username && user.password === password);

      if (authenticatedUser) {
        const updatedUser = {
            username: authenticatedUser.username,
            password: authenticatedUser.password,
            loggedIn: true
        }
        axios.put(API_URL, updatedUser)
        .then(response => {
            console.log(response.data)
        })
        .catch(error => {
            console.log(error);
        })
        console.log('Success');

        navigateTo('/',{ state: { username, password } });
      } else {
        setError('Invalid username or password.');
      }
    } catch (error) {
      console.error('Error fetching users:', error);
      setError('An error occurred while logging in. Please try again later.');
    }

    // Reset fields
    setUsername('');
    setPassword('');
  };

  return (
    <div className='login-form'>
      <form onSubmit={handleSubmit}>
        <label htmlFor='username' className='login'>
          Login
        </label>
        <input
          id='username'
          type='text'
          className='login-input'
          value={username}
          onChange={(e) => setUsername(e.target.value)}
        />
        <label htmlFor='password' className='password'>
          Password
        </label>
        <input
          id='password'
          type='password'
          className='password-input'
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        {error && <div className='error'>{error}</div>}
        <button type='submit'>Login</button>
      </form>
    </div>
  );
}

export default Login;
