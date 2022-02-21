function addition() {
    let input1 = parseFloat(document.getElementById("inputvalue1").value);
    let input2 = parseFloat(document.getElementById("inputvalue2").value);
    let sum = input1 + input2;
    document.getElementById("result").value = sum;
}

function subtraction() {
    let input1 = parseFloat(document.getElementById("inputvalue1").value);
    let input2 = parseFloat(document.getElementById("inputvalue2").value);
    let sub = input1 - input2;
    document.getElementById("result").value = sub;
}

function multiplication() {
    let input1 = parseFloat(document.getElementById("inputvalue1").value);
    let input2 = parseFloat(document.getElementById("inputvalue2").value);
    let mul = input1 * input2;
    document.getElementById("result").value = mul;
}

function division() {
    let input1 = parseFloat(document.getElementById("inputvalue1").value);
    let input2 = parseFloat(document.getElementById("inputvalue2").value);
    let div = input1 / input2;
    document.getElementById("result").value = div;
}

function modulus() {
    let input1 = parseFloat(document.getElementById("inputvalue1").value);
    let input2 = parseFloat(document.getElementById("inputvalue2").value);
    let per = input1 % input2;
    document.getElementById("result").value = per;
}