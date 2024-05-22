import React, { useContext } from 'react';
import { useNavigate } from 'react-router-dom';

function Navbar() {
  const navigate = useNavigate();
  const navigateTo = (url) => {
    navigate(url);
  }

  const handleLogout = () => {
    navigateTo('/login');
  }

  return (
    <nav className='navbar'>
      <div className="nav-content">
        <div className="logo">
          <h1 className='nav-title' onClick={() => { navigateTo('/') }}>ENPM</h1>
        </div>
        <ul className="nav-links">
          <li className='nav-item'><a onClick={() => { navigateTo('/about') }}>About</a></li>
          <li className='nav-item'><a onClick={() => { navigateTo('/contact') }}>Contact</a></li>
        </ul>
      </div>
      <div className="user-info">
     
            <h3 className='nav-user'>Welcome, </h3>
            <button className='login-or-out' onClick={handleLogout}>Logout</button>

          <button className='login-or-out' onClick={() => { navigateTo('/login') }}>Login</button>

      </div>
    </nav>
  );
}

export default Navbar;
