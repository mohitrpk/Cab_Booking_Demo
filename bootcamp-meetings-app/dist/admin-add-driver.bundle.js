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

/***/ "./public/js/admin-add-driver-script.js":
/*!**********************************************!*\
  !*** ./public/js/admin-add-driver-script.js ***!
  \**********************************************/
/***/ (() => {

eval("const form = document.querySelector(\"#addDriverForm\");\nform.addEventListener('submit', addDriver);\n\nfunction addDriver(evnt) {\n  obj = {};\n  childObj = {};\n  obj.username = document.querySelector(\"#userName4\").value;\n  obj.password = document.querySelector(\"#password4\").value;\n  obj.email = document.querySelector(\"#inputEmail4\").value;\n  obj.mobileNumber = document.querySelector(\"#inputMobileNo\").value;\n  obj.address = document.querySelector(\"#inputAddress\").value;\n  obj.licenseNo = document.querySelector(\"#inputLicenseNo\").value;\n  childObj.cabId = document.querySelector(\"#inputCabId\").value;\n  childObj.carType = document.querySelector(\"#inputCarType\").value;\n  childObj.perKmRate = document.querySelector(\"#inputRate\").value;\n  obj.cab = childObj;\n  evnt.preventDefault();\n  console.log(\"OBJ formed\");\n  console.log(obj.username); // console.log(obj.cab.cabId);\n\n  fetch(\"http://localhost:8080/api/v1/driver/\", {\n    method: \"POST\",\n    body: JSON.stringify(obj),\n    headers: {\n      \"Content-Type\": \"application/json\"\n    }\n  }).then(data => data.json()).then(resp => {\n    console.log(resp);\n    console.log(\"res formed\");\n    window.location.replace(\"./index.html\");\n  });\n}\n\n//# sourceURL=webpack://bootcamp-meetings-app/./public/js/admin-add-driver-script.js?");

/***/ })

/******/ 	});
/************************************************************************/
/******/ 	
/******/ 	// startup
/******/ 	// Load entry module and return exports
/******/ 	// This entry module can't be inlined because the eval devtool is used.
/******/ 	var __webpack_exports__ = {};
/******/ 	__webpack_modules__["./public/js/admin-add-driver-script.js"]();
/******/ 	
/******/ })()
;