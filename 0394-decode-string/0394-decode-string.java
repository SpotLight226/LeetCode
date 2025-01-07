class Solution {
    public String decodeString(String s) {
        Stack<Integer> intStack = new Stack<>();
        Stack<StringBuilder> sbStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) { // c가 숫자라면
                // 2자리 이상의 숫자일 수 있으므로, c 에 '0'를 빼서 본래 값으로 바꾸고 
                n = n * 10 + (c - '0') ; // 앞의 n에 * 10해서 자릿 수를 올린다
            } else if (c == '[') { // [ 라면 
                intStack.push(n); // intStack에 해당 문자의 개수인 n을 넣고
                n = 0; // n 초기화
                sbStack.push(sb); 
                sb = new StringBuilder();
            } else if (c == ']') {
                int temp = intStack.pop();
                StringBuilder tempSb = sb;
                sb = sbStack.pop();

                while (temp > 0) {
                    sb.append(tempSb);
                    temp--;
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}