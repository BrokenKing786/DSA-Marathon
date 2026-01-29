//Shifting unique elements to the front, we will use Two pointers for this code
let arr = [1, 3, 5, 6, 7, 9, 9, 9, 87];
let x = 0;
for (let i = 0; i < arr.length; i++) {
  if (arr[i] > arr[x]) {
    x = x + 1;
    arr[x] = arr[i];
  }
}

console.log(arr);
