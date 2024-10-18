/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    // let val = init;
    // // 반복문으로 최종 리턴 val 와 nums 배열의 요소를 넘겨 계산
    // for(let i = 0; i < nums.length; i++){
    //     val = fn(val, nums[i]);
    // }
    // return val;

    // forEach 로 nums의 요소들을 e로 반복해서 init에 fn을 거친 값을 대입
    nums.forEach( e => init = fn(init, e))
    return init;
};