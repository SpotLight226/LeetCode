/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let chunkArr = [];

    for(let i = 0; i < arr.length; i += size){
        // arr 을 잘라서 chunk 에 넣기
        chunkArr.push(arr.slice(i, i + size));
    }

    return chunkArr;
};
