class Solution {
    public int addDigits(int num) {

        // num에서 10의 자릿수가 있을 때 반복
        while(num/10 != 0){
            int sum = 0;

            while(num/10 != 0){
                sum += (num % 10); // 끝자리 떼어내 sum에 합
                num /= 10; // 끝자리 떼어낸 num
            }
            sum += num; // 남은 한 자릿수 num을 sum에 더하기
            num = sum; // 각 자릿 수를 더한 sum을 다시 num으로 하여 한 자릿 수인지에 따라 while 반복
        }

        return num;
    }
}