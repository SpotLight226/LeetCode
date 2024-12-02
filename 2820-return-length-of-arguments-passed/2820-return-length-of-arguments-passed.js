/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
 /*
var argumentsLength = function(...args) {
    return args.length;
};
*/

// args의 길이만큼을 리턴
function argumentsLength() {
    return arguments.length;
}

/**
 * argumentsLength(1, 2, 3); // 3
 */