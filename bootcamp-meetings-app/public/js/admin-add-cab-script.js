const form = document.querySelector("#addCabForm");
form.addEventListener('submit',addCab);
function addCab(evnt)
{
    obj = {}
    obj.carType = document.querySelector("input[id='FormControlInput1']").value;
    obj.perKmRate = document.querySelector("input[id='FormControlInput2']").value;
    evnt.preventDefault()

    fetch("http://localhost:8080/api/v1/cab/",
        {
            method: "POST",
            body: JSON.stringify(obj),
            headers: {
                "Content-Type": "application/json"
            }
        }).then(data => data.json())
        .then(resp => {
            window.location.replace("./index.html");
        })
}
