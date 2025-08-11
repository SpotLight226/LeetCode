/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    // 리턴할 배열
    const resultArr = [];
    // 배열의 요소를 index에 따라 하나씩 fn수행
    arr.forEach((element, index) => {
        resultArr[index] = fn(element, index);
    });

    return resultArr;
};