//Find the second Largest number in an array

let arr = [1, 6, 89, 4, 36];
let secondLargest = -Infinity;
let largest = -Infinity;
for (let i = 0; i < arr.length; i++) {
  if (arr[i] > largest) {
    secondLargest = largest;
    largest = arr[i];
  } else if (arr[i] > secondLargest && arr[i] != largest) {
    secondLargest = arr[i];
  }
}
console.log("Second Largest Number is", secondLargest);
