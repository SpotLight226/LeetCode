/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    // obj 가 배열이라면
    if(Array.isArray(obj)) {
        // obj 의 길이가 0인지 파악해서 리턴
        return obj.length === 0;
    } else { // obj 가 배열이 아니고 키 : 값 일 때
        return Object.keys(obj).length === 0; // Object 에서 key 들의 길이가 0인지 파악해서 리턴
    }
};