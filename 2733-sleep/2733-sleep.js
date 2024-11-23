/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
    // prommiste로 resolve를 setTimeout으로 millis를 대기하다가 출력
    await new Promise(resolve => setTimeout(resolve, millis));
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */