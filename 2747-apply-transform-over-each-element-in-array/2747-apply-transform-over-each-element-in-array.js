/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const resultArr = [];
    arr.forEach((element, index) => {
        resultArr[index] = fn(element, index);
    });

    return resultArr;
};