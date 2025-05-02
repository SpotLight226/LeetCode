/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    /*
    const [v1, v2] = await Promise.all([promise1, promise2]);
    return v1 + v2;
    */
    /*
    // .then 메서드는 Promise가 성공(resolve)되었을 때 실행될 콜백 함수를 등록
    return await Promise.all([promise1, promise2]).then(
        ([v1, v2]) => v1 + v2 //  Promise의 결과값 v1과 v2를 더한 값을 반환
    );
    */

    const [v1, v2] = await Promise.all([promise1, promise2]);
    return v1 + v2;
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */