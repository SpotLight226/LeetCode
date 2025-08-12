/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    // args(배열)의 길이
    return args.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */