/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {
    if(obj === null) return null; // obj가 null이면 null리턴
    if(Array.isArray(obj)) return obj.filter(Boolean).map(compactObject);  
    if(typeof obj !== "object") return obj; // obj가 객체(object)가 아니라면 obj리턴
    
    const compacted = {};
    for (const key in obj) {
        let value = compactObject(obj[key]);
        if (value) compacted[key] = value;
    }

    return compacted;
};