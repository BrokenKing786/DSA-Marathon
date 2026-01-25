let n = 979;
let original = n;
let rev = 0;
let digit = 0;
while (n != 0) {
  digit = n % 10;
  rev = rev * 10 + digit;
  n = Math.floor(n / 10);
}

if (original == rev) {
  console.log("Palindrome");
} else {
  console.log("Not a palindrome number");
}
