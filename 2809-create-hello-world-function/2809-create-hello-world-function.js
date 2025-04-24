/**
 * @return {Function}
 */
var createHelloWorld = function() {
    const str = "Hello World";

    return function() {
        return str;
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */