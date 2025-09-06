/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const result = [];
    // i += size 
    // ex) size = 2 => slice(0, 2)
    // i = 2 => slice(2, 4) ...
    for(let i = 0; i < arr.length; i += size) {
        // arr 을 i 부터 잘라내야할 size 의 크기 까지 잘라서 넣는다
        result.push(arr.slice(i, i + size));
    }

    return result;
};
