/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    /*
    // for문 사용 => 실제 서비스
    return function(x) {
        // 오른 쪽에서 왼쪽으로 가니까, 가장 오른쪽의 인덱스부터 시작
        for(var i = functions.length - 1; i >= 0; i--) {
            x = functions[i](x);
        }

        return x;
    }
    */

    // reduceRight 사용 => 연습용/리팩토링/깔끔한 함수형 스타일
    if(functions.length == 0) {
        return function(x) {
            return x;
        }
    }

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