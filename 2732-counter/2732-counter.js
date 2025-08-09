/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    // 시작 숫자
    let start = n;

    // function 을 호출할 때마다, 시작 숫자에 +1
    return function() {
        return start++;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */