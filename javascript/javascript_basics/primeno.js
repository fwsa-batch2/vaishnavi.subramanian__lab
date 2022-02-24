const inputNumber = 14;
let Prime = true;
if (inputNumber === 1) {
    document.write("1 is neither prime nor composite.");
} else if (inputNumber > 1) {
    for (let i = 2; i < inputNumber; i++) {
        if (inputNumber % i == 0) {
            Prime = false;
            break;
        }
    }
    if (Prime) {
        document.write(`${inputNumber} is a prime number`);
    } else {
        document.write(`${inputNumber} is a not prime number`);
    }
} else {
    ("it is not a prime number.");
}