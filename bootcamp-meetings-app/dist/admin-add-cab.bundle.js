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

/***/ "./public/js/admin-add-cab-script.js":
/*!*******************************************!*\
  !*** ./public/js/admin-add-cab-script.js ***!
  \*******************************************/
/***/ (() => {

eval("const form = document.querySelector(\"#addCabForm\");\nform.addEventListener('submit', addCab);\n\nfunction addCab(evnt) {\n  obj = {};\n  obj.carType = document.querySelector(\"input[id='FormControlInput1']\").value;\n  obj.perKmRate = document.querySelector(\"input[id='FormControlInput2']\").value;\n  evnt.preventDefault();\n  fetch(\"http://localhost:8080/api/v1/cab/\", {\n    method: \"POST\",\n    body: JSON.stringify(obj),\n    headers: {\n      \"Content-Type\": \"application/json\"\n    }\n  }).then(data => data.json()).then(resp => {\n    window.location.replace(\"./index.html\");\n  });\n}\n\n//# sourceURL=webpack://bootcamp-meetings-app/./public/js/admin-add-cab-script.js?");

/***/ })

/******/ 	});
/************************************************************************/
/******/ 	
/******/ 	// startup
/******/ 	// Load entry module and return exports
/******/ 	// This entry module can't be inlined because the eval devtool is used.
/******/ 	var __webpack_exports__ = {};
/******/ 	__webpack_modules__["./public/js/admin-add-cab-script.js"]();
/******/ 	
/******/ })()
;