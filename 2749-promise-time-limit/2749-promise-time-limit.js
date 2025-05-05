/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
    /*
    return async function(...args) {
       const fnPromise = fn(...args);

       const timeoutPromise = new Promise((_, reject) => {
            setTimeout(() => {
                reject('Time Limit Exceeded')
            }, t);
       })

       return Promise.race([fnPromise, timeoutPromise]);
    */

    return async function(...args) {
        return new Promise((resolve, reject) => {
            const timeoutId = setTimeout(() => reject('Time Limit Exceeded'), t)

            fn(...args)
                .then(result => resolve(result))
                .catch(error => reject(error))
                .finally(() => clearTimeout(timeoutId))
        });
    }
};

/**
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */