const fibnum = parseInt(prompt("Enter the number of terms: "));
let n1 = 0,
    n2 = 1,
    nn;

document.write("Fibonacci Series is:");

for (let i = 1; i <= fibnum; i++) {
    document.write(n1, ", ");
    nn = n1 + n2;
    n1 = n2;
    n2 = nn;
}