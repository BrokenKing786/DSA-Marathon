// palindrome of number
let n = 984;
let reverse = 0;
let d = 0;
while (n != 0) {
  d = n % 10;
  reverse = reverse * 10 + d;
  n = Math.floor(n / 10);
}

console.log(reverse);
