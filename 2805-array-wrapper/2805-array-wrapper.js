/**
 * @param {number[]} nums
 * @return {void}
 */
 // nums 를 지정
var ArrayWrapper = function(nums) {
    this.nums = nums;
};

/**
 * @return {number}
 */
 // 더하기
ArrayWrapper.prototype.valueOf = function() {
    return this.nums.reduce((sum, num) => sum + num, 0);
}

/**
 * @return {string}
 */
 // 각 숫자를 , 로 구분지어서 묶기
ArrayWrapper.prototype.toString = function() {
    return `[${this.nums.join(',')}]`;
}

/**
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */