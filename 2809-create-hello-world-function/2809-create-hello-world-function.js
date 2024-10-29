/**
 * @return {Function}
 */
 /*
var createHelloWorld = function() {
    let world = "Hello World";

    return function() {
        return world
    }
};
*/

var createHelloWorld = () => {
    return () => "Hello World";
}

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */