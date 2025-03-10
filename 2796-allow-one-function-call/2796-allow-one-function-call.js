/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    let beenCall = false;
    let answer;

    return function(...args){
        if(!beenCall){
            answer = fn(...args);
            beenCall = true;
            return answer;
        } else {
            return undefined
        }
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
