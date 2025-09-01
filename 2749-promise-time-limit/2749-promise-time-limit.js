/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
    return async function(...args) {
        // Promise.race: 여러 Promise 중 가장 먼저 성공 또는 실패되는 값을 반환
        return Promise.race([

            // 원래 함수 실행
            (async () => {
                try {
                    // fn 이 동기적으로 throw 할 수도 있으므로 try/catch 필요
                    return await fn(...args);
                } catch (err) {
                    // fn 내부 에러는 그대로 reject
                    throw err;
                }
            })(),

            // 시간 초과용 Promise
            new Promise((_, reject) => {
                setTimeout(() => {
                    reject("Time Limit Exceeded");
                }, t);
            })
        ]);
    };
};

/**
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */