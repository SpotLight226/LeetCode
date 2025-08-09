/**
 * @return {Function}
 */
var createHelloWorld = function() {
    // 문장 
    const str = "Hello World";
    
    // function 실행 시, 문장을 리턴
    return function() {
        return str;
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */