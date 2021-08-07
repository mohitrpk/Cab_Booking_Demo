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

/***/ "./public/js/customer-login-script.js":
/*!********************************************!*\
  !*** ./public/js/customer-login-script.js ***!
  \********************************************/
/***/ (() => {

eval("const form = document.querySelector(\"#formLogin1\");\nform.addEventListener('submit', login);\n\nfunction login(evnt) {\n  obj = {};\n  obj.userId = document.querySelector(\"input[id='exampleFormControlInput1']\").value;\n  obj.password = document.querySelector(\"input[id='inputPassword']\").value;\n  evnt.preventDefault();\n  fetch(\"http://localhost:8080/api/v1/customer/validateCustomer\", {\n    method: \"POST\",\n    body: JSON.stringify(obj),\n    headers: {\n      \"Content-Type\": \"application/json\"\n    }\n  }).then(resp => resp.json()).then(data => {\n    if (!(\"error\" in data)) {\n      // console.log(data['customerId']);\n      localStorage.setItem(\"CustomerId\", data['customerId']); // let token = localStorage.getItem(\"TOKEN\");\n      // console.log(localStorage.getItem(\"CustomerId\"));\n\n      window.location.replace(\"./customer-ui-1.html\");\n    } else alert(\"Login Failed\");\n  });\n}\n\nfunction logout() {\n  localStorage.removeItem(\"TOKEN\");\n}\n\nfunction getToken() {\n  return localStorage.getItem(\"TOKEN\");\n}\n\n//# sourceURL=webpack://bootcamp-meetings-app/./public/js/customer-login-script.js?");

/***/ })

/******/ 	});
/************************************************************************/
/******/ 	
/******/ 	// startup
/******/ 	// Load entry module and return exports
/******/ 	// This entry module can't be inlined because the eval devtool is used.
/******/ 	var __webpack_exports__ = {};
/******/ 	__webpack_modules__["./public/js/customer-login-script.js"]();
/******/ 	
/******/ })()
;