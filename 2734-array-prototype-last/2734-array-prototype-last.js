/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function() {
    if(this.length == 0){ // 길이가 0이면 -1
        return -1;
    } else{
        return this[this.length - 1]; // 아니면 가장 끝 요소 리턴
    }
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */