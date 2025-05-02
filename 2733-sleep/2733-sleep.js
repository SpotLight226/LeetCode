/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
    // await로 대기하다가, setTimeout 으로 millis초 후에 생성되는 promise를 만들어 해결
    await new Promise(resolve => setTimeout(resolve, millis));
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */