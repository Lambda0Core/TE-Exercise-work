document.addEventListener('DOMContentLoaded', doAfterDOMLoads);

function doAfterDOMLoads() {

   let btn = document.getElementById('theButton');
   let sub = document.getElementById('subcontent');
   let main = document.getElementById('content');

   btn.addEventListener('click', buttonAction);
   sub.addEventListener('click', buttonAction);
   main.addEventListener('click', buttonAction);
}

function buttonAction(event) {
    event.stopPropagation()

   window.alert('surprise!');
}
