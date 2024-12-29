class Calculator {
    
    /** 
     * @param {number} value
     */
    constructor(value) {
        this.result = value; // 생성 시, result에 입력된 value를 대입
    }
    
    /** 
     * @param {number} value
     * @return {Calculator}
     */
    add(value){
        this.result += value;
        return new Calculator(this.result); // 계산 후, 새로운 Calculator를 생성하여 리턴
    }
    
    /** 
     * @param {number} value
     * @return {Calculator}
     */
    subtract(value){
        this.result -= value;
        return new Calculator(this.result);
    }
    
    /** 
     * @param {number} value
     * @return {Calculator}
     */  
    multiply(value) {
        this.result *= value;
        return new Calculator(this.result);
    }
    
    /** 
     * @param {number} value
     * @return {Calculator}
     */
    divide(value) {
        if(value === 0) {
            throw 'Division by zero is not allowed';
        } else {
            this.result /= value;
        }
        return new Calculator(this.result);
    }
    
    /** 
     * @param {number} value
     * @return {Calculator}
     */
    power(value) {
        this.result = Math.pow(this.result, value);
        return new Calculator(this.result);
    }
    
    /** 
     * @return {number}
     */
    getResult() {
        return this.result; 
    }
}