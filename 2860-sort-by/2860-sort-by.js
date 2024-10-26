/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function(arr, fn) {
    // 정렬로 기준을 작성해준다
    // arr 배열에서 비교할 요소를 a와 b로 표기하고 fn에 따라 정의된 a와 b를 비교하여 오름차순으로 비교
    // 내림차순 비교시, fn(b) - fn(a)
    return arr.sort((a, b) => fn(a) - fn(b));
};