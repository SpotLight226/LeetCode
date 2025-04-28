/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    const resultArr = [];

    for(var i = 0; i < arr.length; i++) {
        // fn에 arr[i] 와 인덱스 i 를 넣어서 true결과가 나오면 리턴할 배열에 넣기
        if(fn(arr[i], i)) {
            resultArr.push(arr[i]);
        }
    }
    
    return resultArr;
};