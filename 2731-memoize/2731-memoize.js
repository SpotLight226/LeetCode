/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const cache = {}; // 결과를 저장할 객체

    return function(...args) {
        // ...args : 호출할 때 전달된 인자를 배열로 모음
        const key = JSON.stringify(args); // // 인자를 문자열로 변환해서 캐시의 key로 사용

        // cache 안에 key가 있다면(한 번 호출된 적 있다면)
        if(key in cache) { 
            return cache[key]; // cache 의 값을 반환
        }

        //  // fn을 실제로 실행해서 결과를 얻음
        const result = fn.apply(this, args);
        cache[key] = result; // 결과를 캐시에 저장

        return result; 
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */