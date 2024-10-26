/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    // 변수 val1, val2에 await로 2개의 약속 Promise에 all로 모든 변수가 들어올 때까지 대기하다가 
    // 2개의 변수가 들어오면 val1 + val2를 리턴
    const [val1, val2] = await Promise.all([promise1, promise2]);

    return  val1 + val2;
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */