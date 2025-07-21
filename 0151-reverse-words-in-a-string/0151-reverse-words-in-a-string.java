class Solution {
    public String reverseWords(String s) {
        // s 를 띄어쓰기(공백)을 기준으로 잘라 배열로
        String[] arr = s.split(" ");
        int l = 0;
        int r = arr.length - 1;

        // l 이 r 보다 커질 때까지(문자열의 중간까지)
        while(l < r) {
            // 인덱스 l 의 문장을 임시로 저장해서 위치를 변경
            String temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        StringBuilder sb = new StringBuilder();
        for(String str : arr) {
            // 각 문장은 띄어쓰기로 이어져 있음
            if(!str.isEmpty()) {
                if(sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(str);
            }
        }

        return sb.toString();
    }
}