/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function(arr, fn) {
    // fn(a) - fn(b) → 오름차순 정렬
    // fn(b) - fn(a) → 내림차순 정렬
    return arr.sort((a, b) => fn(a) - fn(b));
};