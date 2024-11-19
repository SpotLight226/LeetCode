/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    let transArr = []; // 변형된 숫자를 저장할 배열
    
    // arr의 배열을 순회하며, fn에 arr[i]와 사용할 i를 넣는다
    for(let i = 0; i < arr.length; i++){
        transArr[i] = fn(arr[i], i);
    }
    return transArr;
};