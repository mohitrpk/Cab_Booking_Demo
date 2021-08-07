/*
 * ATTENTION: The "eval" devtool has been used (maybe by default in mode: "development").
 * This devtool is neither made for production nor for readable output files.
 * It uses "eval()" calls to create a separate source file in the browser devtools.
 * If you are trying to read the output file, select a different devtool (https://webpack.js.org/configuration/devtool/)
 * or disable the default devtool with "devtool: false".
 * If you are looking for production-ready output files, see mode: "production" (https://webpack.js.org/configuration/mode/).
 */
/******/ (() => { // webpackBootstrap
/******/ 	var __webpack_modules__ = ({

/***/ "./public/js/customer-ui-1-script.js":
/*!*******************************************!*\
  !*** ./public/js/customer-ui-1-script.js ***!
  \*******************************************/
/***/ (() => {

eval("const form = document.querySelector(\"#tripBookingForm\");\nform.addEventListener('submit', tripBooking);\n\nfunction tripBooking(evnt) {\n  // let customerId = localStorage.getItem(\"CustomerId\");\n  // console.log(customerId);\n  // obj = {}\n  // obj.fromLocation = document.querySelector(\"input[id='FormControlInput1']\").value;\n  // obj.toLocation = document.querySelector(\"input[id='FormControlInput2']\").value;\n  // obj.status = true;\n  let fromLocation = document.querySelector(\"input[id='FormControlInput1']\").value;\n  let toLocation = document.querySelector(\"input[id='FormControlInput2']\").value;\n  evnt.preventDefault(); // let url = `http://localhost:8080/api/v1/createTrip/${customerId}`;\n  // console.log(\"http://localhost:8080/api/v1/driver/getFreeDriver\");\n\n  fetch(\"http://localhost:8080/api/v1/driver/getFreeDriver\", {\n    method: \"GET\",\n    // body: JSON.stringify(obj),\n    headers: {\n      \"Content-Type\": \"application/json\"\n    }\n  }).then(resp => resp.json()).then(data => {\n    if (!(\"error\" in data)) {\n      console.log(data[\"username\"]);\n      console.log(data[\"mobileNumber\"]);\n      localStorage.setItem(\"toLocation\", toLocation);\n      localStorage.setItem(\"fromLocation\", fromLocation);\n      localStorage.setItem(\"username-ui-2\", data[\"username\"]);\n      localStorage.setItem(\"mobileNo-ui-2\", data[\"mobileNumber\"]); //\n      // let span1 = document.getElementById(\"username-ui-2\");\n      // let span2 = document.getElementById(\"mobileNo-ui-2\");\n      // console.log(span1.textContent);\n      // span1.textContent =data[\"username\"];\n      // span2.textContent = data[\"mobileNumber\"];\n\n      window.location.replace(\"./customer-ui-2.html\");\n    } else alert(\"No Driver Available Failed\");\n  });\n}\n\n//# sourceURL=webpack://bootcamp-meetings-app/./public/js/customer-ui-1-script.js?");

/***/ })

/******/ 	});
/************************************************************************/
/******/ 	
/******/ 	// startup
/******/ 	// Load entry module and return exports
/******/ 	// This entry module can't be inlined because the eval devtool is used.
/******/ 	var __webpack_exports__ = {};
/******/ 	__webpack_modules__["./public/js/customer-ui-1-script.js"]();
/******/ 	
/******/ })()
;