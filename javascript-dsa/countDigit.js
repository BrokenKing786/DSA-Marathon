
// count of number
let n = 1234567;
let count = 0;
while (n != 0) {
    count++;
    // Use Math.floor to remove the decimal and keep only the integer part
    n= Math.floor(n /10);
}

console.log(count);
