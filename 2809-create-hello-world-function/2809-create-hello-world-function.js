/**
 * @return {Function}
 */
var createHelloWorld = function() {
    let world = "Hello World";

    return function() {
        return world
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */