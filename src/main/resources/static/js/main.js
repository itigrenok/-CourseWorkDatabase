let numberTransmission = 0
let calculationUrl = window.origin + "/calculation";

document.getElementById("calculation-button").addEventListener('click', async () => {
    let aw = document.getElementById("aw").value
    let bw = document.getElementById("bw").value
    let u = document.getElementById("u").value
    let B = document.getElementById("B").value
    let m = document.getElementById("m").value
    let z1 = document.getElementById("z1").value
    let z2 = document.getElementById("z2").value
    let fdb = document.getElementById("fdb").value
    let hb = document.getElementById("hb").value
    let gearLocationType = document.getElementById("gearLocationType").value
    let x = document.getElementById("x").value
    let zv = document.getElementById("zv").value
    let Yf = document.getElementById("Yf").value
    let toothType = document.getElementById("toothType").value
    let aFP = document.getElementById("aFP").value
    let isShaftRigid = document.getElementById("isShaftRigid").checked

    let body = JSON.stringify({
        "aw": aw,
        "bw": bw,
        "u": u,
        "b": B,
        "m": m,
        "z1": z1,
        "z2": z2,
        "fdb": fdb,
        "hb": hb,
        "gearLocationType": gearLocationType,
        "x": x,
        "zv": zv,
        "yf": Yf,
        "toothType": toothType,
        "afp": aFP,
        "isShaftRigid": isShaftRigid
    })

    console.log(body)

    let response = await fetch(calculationUrl, {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: body
    })

    if (response.ok) {
        let json = await response.json()
        document.getElementById("result").innerHTML = "" + json.result
    }

})