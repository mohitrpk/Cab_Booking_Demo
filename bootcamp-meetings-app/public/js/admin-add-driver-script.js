const form = document.querySelector("#addDriverForm");
form.addEventListener('submit',addDriver);
function addDriver(evnt)
{
    obj = {};
    childObj = {};
    obj.username = document.querySelector("#userName4").value;
    obj.password = document.querySelector("#password4").value;
    obj.email = document.querySelector("#inputEmail4").value;
    obj.mobileNumber = document.querySelector("#inputMobileNo").value;
    obj.address = document.querySelector("#inputAddress").value;
    obj.licenseNo = document.querySelector("#inputLicenseNo").value;
    childObj.cabId = document.querySelector("#inputCabId").value;
    childObj.carType = document.querySelector("#inputCarType").value;
    childObj.perKmRate = document.querySelector("#inputRate").value;
    obj.cab=childObj

    evnt.preventDefault()
    console.log("OBJ formed");
    console.log(obj.username);
    // console.log(obj.cab.cabId);
    fetch("http://localhost:8080/api/v1/driver/",
        {
            method: "POST",
            body: JSON.stringify(obj),
            headers: {
                "Content-Type": "application/json"
            }
        }).then(data => data.json())
        .then(resp => {
            console.log(resp)
            console.log("res formed");
            window.location.replace("./index.html");
        })
}
