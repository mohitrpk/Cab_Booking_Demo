const form = document.querySelector("#formLogin1");
form.addEventListener('submit',login);
function login(evnt)
{
    obj = {}
    obj.userId = document.querySelector("input[id='exampleFormControlInput1']").value;
    obj.password = document.querySelector("input[id='inputPassword']").value;
    evnt.preventDefault()

    fetch("http://localhost:8080/api/v1/customer/validateCustomer",
        {
            method: "POST",
            body: JSON.stringify(obj),
            headers: {
                "Content-Type": "application/json"
            }
        }).then(resp => resp.json())
        .then(data => {
            if (!("error" in data)) {
                // console.log(data['customerId']);
                localStorage.setItem("CustomerId", data['customerId']);
                // let token = localStorage.getItem("TOKEN");
                // console.log(localStorage.getItem("CustomerId"));
                window.location.replace("./customer-ui-1.html");
            } else
                alert("Login Failed");
        })
}

function logout() {
    localStorage.removeItem( "TOKEN" );
}

function getToken() {
    return localStorage.getItem( "TOKEN" );
}
