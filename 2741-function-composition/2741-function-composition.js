/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    
    return function(x) {
        // 오른 쪽에서 왼쪽으로 가니까, 가장 오른쪽의 인덱스부터 시작
        for(var i = functions.length - 1; i >= 0; i--) {
            x = functions[i](x);
        }

        return x;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */