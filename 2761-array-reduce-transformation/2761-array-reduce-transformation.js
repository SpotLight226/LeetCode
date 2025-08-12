/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let result = init; // 결과에 기본값 init을 설정

    // 반복문으로 결과에 fn 의 결과를 더함
    for(var i = 0; i < nums.length; i++) {
        result = fn(result, nums[i]);
    }

    /*
    // forEach 구문
    nums.forEach(n => {
        result = fn(result, n);
    });
    */
    return result;
};