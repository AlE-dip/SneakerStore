import "./App.css";
import { useEffect } from "react";
import HomePage from "./pages/HomePage";
import { Helmet } from "react-helmet";

function App() {
  // useEffect(() => {
  //   fetch("http://localhost:8080/api/public/test")
  //     .then((response) => response.text())
  //     .then((data) => console.log(data));
  // }, []);

  return (
    <div>
      <HomePage></HomePage>
      <Helmet>
        <script src="js/vendor/jquery-1.12.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/jquery-price-slider.js"></script>
        <script src="lib/js/jquery.nivo.slider.js"></script>
        <script src="lib/home.js"></script>
        <script src="js/jquery.meanmenu.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.elevatezoom.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/plugins.js"></script>
        <script src="js/main.js"></script>
      </Helmet>
    </div>
  );
}

export default App;
