const form = document.querySelector(#id="button-1-customer-ui-2");
form.addEventListener('submit',confirmBooking);
function confirmBooking(evnt)
{

    let customerId = localStorage.getItem("CustomerId");
    console.log(customerId);
    obj = {}
    obj.fromLocation = localStorage.getItem("toLocation");
    obj.toLocation = localStorage.setItem("fromLocation");
    obj.localStorage.getItem("username-ui-2");
    obj.status = true;
    obj.distanceKM=14;
    obj.totalFare=230; //function can be used
    obj.startDate= Date.now();
    obj.endDate= Date.now();

    evnt.preventDefault()
    let url = `http://localhost:8080/api/v1/createTrip/${customerId}`;
    fetch(url,
        {
            method: "GET",
            body: JSON.stringify(obj),
            headers: {
                "Content-Type": "application/json"
            }
        }).then(resp => resp.json())
        .then(data => {
            if (!("error" in data)) {
                console.log(data["username"]);
                console.log(data["mobileNumber"]);
                localStorage.setItem("toLocation",toLocation);
                localStorage.setItem("fromLocation",fromLocation);
                localStorage.setItem("username-ui-2",data["username"]);
                localStorage.setItem("mobileNo-ui-2",data["mobileNumber"]);

                let span1 = document.getElementById("username-ui-2");
                let span2 = document.getElementById("mobileNo-ui-2");
                console.log(span1.textContent);
                span1.textContent =data["username"];
                span2.textContent = data["mobileNumber"];
                window.location.replace("./customer-ui-2.html");
            } else
                alert("No Driver Available Failed");
        })

}
function init(){
    let span1 = document.getElementById("username-ui-2");
    let span2 = document.getElementById("mobileNo-ui-2");
    // console.log(span1.textContent);
    span1.textContent = localStorage.getItem("username-ui-2");
    span2.textContent = localStorage.getItem("mobileNo-ui-2")
}
init();
