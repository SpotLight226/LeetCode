/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    // functions 에 내용이 없다면, 그냥 x를 리턴
    if(functions.length === 0) {
        return function(x) {
            return x;
        }
    }
    
    // reduceRight => 오른쪽 -> 왼쪽
    // functions 의 요소를 오른쪽부터 왼쪽으로 각 함수를 진행
    return functions.reduceRight(function(prevFn, nextFn) {
        return function(x) {
            return nextFn(prevFn(x));
        }
    })
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */