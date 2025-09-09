/**
 * @param {number[]} nums
 * @return {void}
 */
var ArrayWrapper = function(nums) {
    this.nums = nums;
};

/**
 * @return {number}
 */
ArrayWrapper.prototype.valueOf = function() {
    // 더하기 
    // sum에 num을 다 더하기
    return this.nums.reduce((sum, num) => sum + num, 0);
}

/**
 * @return {string}
 */
ArrayWrapper.prototype.toString = function() {
    // String => 문장형태로 나열
    // 각 num 을 , 을 사이에 넣어서 묶기
    return `[${this.nums.join(',')}]`;
}

/**
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */