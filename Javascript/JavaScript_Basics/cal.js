let value = prompt('Enter value ( either +, -, *,/ or % ): ');
let a = parseFloat(prompt('Enter the first number you want to calculate: '));
let b = parseFloat(prompt('Enter the second number you want to calculate: '));
let ans;
if (value == '+') {
    ans = a + b;
} else if (value == '-') {
    ans = a - b;
} else if (value == '*') {
    ans = a * b;
} else if (value == '%') {
    ans = a / 100 * b;
} else {
    ans = a / b;
}

document.write(`${a} ${value} ${b} = ${ans}`)