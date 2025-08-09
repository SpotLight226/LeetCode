/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        // toBe 호출 시,
        toBe: function(otherVal) {
            // toBe 의 otherVal가 function 의 val 과 같다면
            if(val === otherVal) {
                return true; // true 리턴
            } else { // 다르다면
                throw new Error("Not Equal"); // 에러를 생성하여 리턴 (에러의 내용은 Not Equal)
            }
        },
        // notToBe 호출 시,
        notToBe: function(otherVal) {
            // notToBe 의 otherVal 가 function 의 val 과 다르다면
            if(val !== otherVal) {
                return true; // true 리턴
            } else { // 같다면
                throw new Error("Equal"); // 에러를 생성하여 리턴 (에러의 내용은 Equal)
            }
        }
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */