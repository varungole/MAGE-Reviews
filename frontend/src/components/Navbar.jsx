import React from 'react'
import { useNavigate } from 'react-router-dom'


function Navbar() {
  const navigate = useNavigate();

  const navigateTo = (url) => {
      navigate(url);
  }


  return (
    <nav className='navbar'>
    <div className="nav-content">
      <div className="logo">
        <h1 className='nav-title' onClick={() => {navigateTo('/')}}>ENPM</h1>
      </div>
      <ul className="nav-links">
        <li className='nav-item'><a onClick={() => {navigateTo('/about')}}>About</a></li>
        <li className='nav-item'><a onClick={() => {navigateTo('/contact')}}>Contact</a></li>
      </ul>
    </div>
  </nav>
  )
}

export default Navbar