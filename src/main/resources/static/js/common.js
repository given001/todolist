document.addEventListener("DOMContentLoaded", function (e) {
    // const submit = document.getElementById("submit");
    // submit.addEventListener("click", function(e) {
    //     const content = document.getElementById("content").value
    //     if(content === null) {
    //
    //     }
    // })

})

function validateForm() {
    const name = document.forms["todo-form"]["content"];
    if(name.value == 0) {
        document.getElementById('error-content').innerHTML='Please enter a valid name';
        name.focus();
        return false;
    } else {
        document.getElementById('error-content').innerHTML='';
    }

}
