/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
 // 클래스 형식
class Counter {
    // 생성자
    // 기존 init 값은 그대로 두고, present(현재 값)을 사용
    constructor(init) {
    this.init = init;
    this.present = init;
    }
    
    // 증가 : 현재의 값에 +1 해서 리턴
    increment() {
        this.present += 1;
        return this.present;
    }
    // 감소 : 현재의 값에 -1 해서 리턴
    decrement() {
        this.present -= 1;
        return this.present;
    }
    // 리셋 : 현재의 값을 기존의 init 값으로 초기화 해서 리턴
    reset() {
        this.present = this.init;
        return this.present;
    }

}

var createCounter = function(init) {
    /*
    // 화살표 함수 : 쉽고 현재 값을 보존하기 쉬움
    let present = init
    return {
        increment:()=> ++present,
        decrement:()=> --present,
        reset:()=> present = init,
    }
    */

    // 클래스 방식 : 여러 동작을 수행하는 객체를 생성해서, 각 행위를 수행
    return new Counter(init);
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */