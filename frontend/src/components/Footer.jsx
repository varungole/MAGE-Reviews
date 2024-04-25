import React from 'react';
import UMD_LOGO from '../images/umd.png';

function Footer() {
  return (
    <footer className="footer">
      <div className="footer-content">
        <div className="footer-logo">
          <img src={UMD_LOGO} alt="UMD Logo" className="umd-logo" />
          <p className="company-name">University of Maryland</p>
        </div>
        <div className="contact-info">
          <p>Contact us at <a href="mailto:info@example.com">info@example.com</a></p>
          <ul className="social-links">
            <li><a href="https://twitter.com/yourhandle" target="_blank" rel="noopener noreferrer">Twitter</a></li>
            <li><a href="https://facebook.com/yourpage" target="_blank" rel="noopener noreferrer">Facebook</a></li>
            <li><a href="https://instagram.com/yourhandle" target="_blank" rel="noopener noreferrer">Instagram</a></li>
          </ul>
        </div>
      </div>
      <div className="footer-bottom">
        <p>© {new Date().getFullYear()} Varun Gole. All rights reserved.</p>
      </div>
    </footer>
  );
}

export default Footer;
