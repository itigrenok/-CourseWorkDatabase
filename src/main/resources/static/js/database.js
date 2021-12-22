let headers = [ "id",  "x",  "yf",  "eb",  "kfv",  "ye",  "yb",  "kfa",  "kfb",  "dost",  "g0",  "ea",  "aw",   "bw",   "u",   "b",   "afp",   "m",   "fbd",   "hb",   "zv",   "z1",   "z2",   "af",   "v",   "wfv",   "n",   "wft"]

async function load_page() {
    let header = document.getElementById("header")

    for (let i = 0; i < headers.length; i++) {
        header.innerHTML += "<th scope='col'>" + headers[i] + "</th>"
    }

    let response = await fetch(window.origin + "/database/all");
    response = await response.json()

    let body = document.getElementById("body")
    for (let i = 0; i < response.length; i++) {
        let row = "<tr><th scope='row'>"+ response[i].id +"</th>"
        for (let j = 0; j < headers.length; j++) {
            if (headers[j] !== "id") {
                row += "<td>"+ response[i][headers[j]] +"</td>"
            }
        }
        row += "</tr>"

        body.innerHTML += row
    }
}

document.addEventListener("DOMContentLoaded", async function() {
    await load_page()
});