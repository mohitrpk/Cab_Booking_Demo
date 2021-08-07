const form = document.querySelector("#tripBookingForm");
form.addEventListener('submit',tripBooking);
function tripBooking(evnt)
{

    // let customerId = localStorage.getItem("CustomerId");
    // console.log(customerId);
    // obj = {}
    // obj.fromLocation = document.querySelector("input[id='FormControlInput1']").value;
    // obj.toLocation = document.querySelector("input[id='FormControlInput2']").value;
    // obj.status = true;
    let fromLocation = document.querySelector("input[id='FormControlInput1']").value;
    let toLocation = document.querySelector("input[id='FormControlInput2']").value;

    evnt.preventDefault()
    // let url = `http://localhost:8080/api/v1/createTrip/${customerId}`;
    // console.log("http://localhost:8080/api/v1/driver/getFreeDriver");
    fetch("http://localhost:8080/api/v1/driver/getFreeDriver",
        {
            method: "GET",
            // body: JSON.stringify(obj),
            headers: {
                "Content-Type": "application/json"
            }
        }).then(resp => resp.json())
        .then(data => {
            if (!("error" in data)) {
                localStorage.setItem("toLocation",toLocation);
                localStorage.setItem("fromLocation",fromLocation);
                localStorage.setItem("username-ui-2",data["username"]);
                localStorage.setItem("mobileNo-ui-2",data["mobileNumber"]);
                window.location.replace("./customer-ui-2.html");
            } else
                alert("No Driver Available Failed");
        })
}
