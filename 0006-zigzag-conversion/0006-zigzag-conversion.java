class Solution {
    public String convert(String s, int numRows) {
        // 행 수가 1이거나, s의 길이보다 행 수가 크다면, 한 줄로 됨
        if(numRows == 1 || numRows >= s.length()) return s;
        
        // List에 character 을 넣는 배열을 2중으로
        int idx = 0;
        int depth = 1;
        List<Character>[] rows = new ArrayList[numRows];
        for(int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }

        for(char c : s.toCharArray()) {
            // 각 행에 문자를 넣고
            rows[idx].add(c);
            // 다음 depth 로 넘어가기
            if(idx == 0) { // 첫 줄이면 depth 를 1
                depth = 1;
            } else if (idx == numRows - 1) { // 가장 끝이면 depth 를 -1
                depth = -1;
            }

            idx += depth;
        }

        StringBuilder sb = new StringBuilder();
        for(List<Character> row : rows) {
            for(char c : row) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}