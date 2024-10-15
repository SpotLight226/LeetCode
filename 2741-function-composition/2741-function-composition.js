/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
	if (functions.length === 0) { // 입력된 functions의 길이가 0이면 그대로 x를 리턴
    return function(x) { return x; };
  }
    // functions에서 오른쪽부터 시작해서 각 function을 실행
  return functions.reduceRight(function(prevFn, nextFn) {
    return function(x) {
      return nextFn(prevFn(x)); // 이전 Fn의 값을 다음 Fn에 넣기
    };
  });

};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */