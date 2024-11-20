/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let temp = []; // 임시 배열
    for(let i = 0; i < arr.length; i++){ // 자바 스크립트에서는 자바의 반복문과 동일하지만 변수 형이 let(중복 X)
        if(fn(arr[i], i)){ // fn에 arr의 요소를 넣었을 때 값이 있다면, i를 인덱스로 임시 배열 temp에 넣기
            temp.push(arr[i]); // temp에 arr[i]를 넣는다 (push)
        }
    }
    
    return temp // temp 리턴
};