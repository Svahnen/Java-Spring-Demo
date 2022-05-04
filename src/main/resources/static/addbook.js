function data() {
    return {
        "title": document.getElementById("title").value,
        "author": document.getElementById("author").value
    }
}


document.getElementById("button").addEventListener("click", function () {
    event.preventDefault()
    let xhr = new XMLHttpRequest()
    let url = "http://localhost:8081/book/add"
    xhr.open("POST", url, true)
    xhr.setRequestHeader("Content-Type", "application/json")
    xhr.send(JSON.stringify(data()))
    console.log(JSON.stringify(data()))
}) 
