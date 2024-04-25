import {BrowserRouter, Routes, Route} from "react-router-dom";
import './App.css'
import Home from "./components/Home";
import Navbar from "./components/Navbar";
import Footer from "./components/Footer";
import About from "./components/About";
import Contact from "./components/Contact";
import Software from "./components/Courses/Software";
import SoftwareReviews from "./components/Reviews/SoftwareReviews";
import SoftwareAdmits from "./components/Admits/SoftwareAdmits";
import Robotics from "./components/Courses/Robotics";
import SoftwareCourses from "./components/Program-Courses/SoftwareCourses";
import Form from "./components/Form";

function App() {
  
  
  return (
    <div>
    <BrowserRouter>
    <Navbar />
    <Routes>
      <Route path='/' element={<Home />}></Route>
      <Route path='/about' element={<About />}></Route>
      <Route path='/contact' element={<Contact />}></Route>
      <Route path='/software' element={<Software />}></Route>
      <Route path='/software/software-reviews' element={<SoftwareReviews />}></Route>
      <Route path='/software/software-admits' element={<SoftwareAdmits />}></Route>
      <Route path='/robotics' element={<Robotics/>}></Route>
      <Route path="/software/software-courses" element={<SoftwareCourses />}></Route>
      <Route path="/software/submireviewt-" element={<Form />}></Route>

    </Routes>
    <Footer />
    </BrowserRouter>
   </div>
  )
}

export default App
