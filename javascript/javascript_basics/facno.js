const facno = 4;

if (facno < 0) {
    document.write("Factorial for negative number does not exist. :(");
} else if (facno === 0) {
    document.write(`The factorial of ${facno} is 1.`);
} else {
    let ans = 1;
    for (i = 1; i <= facno; i++) {
        ans *= i;
    }
    document.write("The factorial of 4 is " + ans);
}