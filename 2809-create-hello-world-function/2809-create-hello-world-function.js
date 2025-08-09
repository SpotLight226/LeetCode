/**
 * @return {Function}
 */
var createHelloWorld = function() {
    /*
    // 문장 
    const str = "Hello World";
    
    // function 실행 시, 문장을 리턴
    return function() {
        return str;
    }
    */

    // 그냥 리턴
    return function() {
        return "Hello World";
    }


};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */