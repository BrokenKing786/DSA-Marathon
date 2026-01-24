// 1
// 10
// 101
// 1010
// 10101
// 101010

let n = 6;
for (let i = 1; i <= n; i++) {
    let row = "";
    let k = 1;
    for (let j = 1; j <= i; j++) {
        row = row + k;
        if (k == 1) {
            k = 0;
        }
        else {
            k = 1;
        }

    }
    console.log(row);
}