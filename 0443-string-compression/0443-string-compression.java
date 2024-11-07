class Solution {
    public int compress(char[] chars) {
        // 단순 압축 배열의 길이를 재는 것이 아닌 배열 자체를 압축한 것을 리턴해주어야 함
        int idx = 0; // 변경할 인덱스

        for (int i = 0; i < chars.length;) {
            char c = chars[i]; // 현재 문자
            int count = 0; // 개수
            // chars[i] 와 c 가 같은 개수를 세기, i 를 증가 
            while (i < chars.length && chars[i] == c) {
                count++;
                i++;
            }

            chars[idx++] = c; // 배열에서 문자의 개수 앞에 문자 넣기

            // 개수가 1보다 크다면 count를 문자열로 바꾼 후 문자 배열로 만들어 chars에 넣기
            if (count > 1) {
                char[] arr = String.valueOf(count).toCharArray();
                // 개수를 문자 배열로 만들어 한 문자 씩 chars에 넣기
                for (char ac : arr) {
                    chars[idx++] = ac;
                }
            }
        }

        return idx; // 모든 문자의 개수를 chars에 넣어서 변경했으면 마지막에 idx++가 되어 chars의 압축 배열의 길이가 됨
    }
}