/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {

    /// reduce 로 grouped 객체에 요소들을 모은다
    return this.reduce((grouped, item) => {
        // fn(item) 의 결과를 key 로 사용
        const key = fn(item); 
        // 해당 key 가 없으면 새로운 배열 생성
        if(!grouped[key]) {
            grouped[key] = [];
        }
        // 해당 key 의 배열에 item 추가
        grouped[key].push(item);

        return grouped;
    }, {});
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */