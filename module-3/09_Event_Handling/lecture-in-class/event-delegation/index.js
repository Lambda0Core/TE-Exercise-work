const colors = document.getElementById("colors");
colors.addEventListener("click", event => {
    if (event.target.nodeName.toLowerCase() === "li"){
        event.target.style.backgroundColor = event.target.innerText;
    }
})

//functions
function addOrange(){
    const orange = document.createElement("li");
    orange.innerText = "Orange";
    colors.appendChild(orange);
}

function addBlue(){
    const blue = document.createElement("li");
    blue.innerText = "LightBlue";
    colors.appendChild(blue);
}

function action() {
    window.alert('No.... you are awesome!');
 }

 // window onload

document.addEventListener('DOMContentLoaded', () => {
    const orangeButton = document.getElementById("btnAddOrange");
    orangeButton.addEventListener('click', addOrange);

    const blueButton = document.getElementById("btnAddBlue");
    blueButton.addEventListener('click', addBlue);


    let button = document.getElementById('superBtn');
    button.addEventListener('click', action);



})
