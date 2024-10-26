/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        // toBe : 처음들어오는 val와 val2가 같으면 true, 아니라면 error("Not Equal")을 리턴
        toBe: (val2) => {
            if(val !== val2){
                throw new Error("Not Equal");
            }else{
                return true;
            }
        },
        // notToBe : 처음 들어온 val와 val2가 같으면 error("Equal")을 리턴, 아니라면 true리턴
        notToBe: (val2) => {
            if(val === val2){
                throw new Error("Equal");
            }else{
                return true;
            }
        }
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */