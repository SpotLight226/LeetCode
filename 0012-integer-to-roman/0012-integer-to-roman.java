class Solution {
    public String intToRoman(int num) {
        // 로마 숫자와 10진수 숫자를 인덱스로 매칭
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < values.length; i++) {
            if(num == 0) {
                break;
            }

            // nums 에서 10진수의 값이 있다면, 해당 인덱스의 로마 숫자를 sb에 넣고, num에서 10진수 값 빼기
            while(num >= values[i]) {
                sb.append(romans[i]);
                num -= values[i];
            }
        }

        return sb.toString();
    }
}