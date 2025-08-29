class Calculator {
    
    /** 
     * @param {number} value
     */
     // 생성자 => 인스턴스 변수 result 에 value 값을 할당해서 이후 계산에 사용
     // calculator 의 현재 상태를 객체 내부에 저장하고, 메서드 체이닝을 이어갈 수 있게 인스턴스 변수 사용
    constructor(value) {
        this.result = value;
    }
    
    /** 
     * @param {number} value
     * @return {Calculator}
     */
    // 더하기
    add(value){
        this.result += value;
        return this;
    }
    
    /** 
     * @param {number} value
     * @return {Calculator}
     */
     // 빼기
    subtract(value){
        this.result -= value;
        return this;
    }
    
    /** 
     * @param {number} value
     * @return {Calculator}
     */  
     // 곱하기
    multiply(value) {
        this.result *= value;
        return this;
    }
    
    /** 
     * @param {number} value
     * @return {Calculator}
     */
     // 나누기
    divide(value) {
        // 0으로는 나눌 수 없으므로, 에러를 리턴
        if (value === 0) {
            throw new Error('Division by zero is not allowed');
        }
        this.result /= value;
        return this;
    }
    
    /** 
     * @param {number} value
     * @return {Calculator}
     */
     // 제곱 => Math 메서드의 pow 를 사용
    power(value) {
        this.result = Math.pow(this.result, value);
        return this;
    }
    
    /** 
     * @return {number}
     */
     // 결과값을 리턴
    getResult() {
        return this.result;
    }
}