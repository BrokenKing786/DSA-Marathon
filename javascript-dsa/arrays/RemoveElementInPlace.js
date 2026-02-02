//We will use 2 pointer arrays
// we will remove elemnt in place and here x will be the number of elements or till x
// index which won't be having the elemnt that needs to be removed
let arr = [1, 2, 3, 5, 3];
let element = 5;
let x = 0;
for (let i = 0; i < arr.length; i++) {
  if (arr[i] != element) {
    arr[x] = arr[i];
    x = x + 1;
  }
}

console.log(x);
