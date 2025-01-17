class Solution {
    public String convert(String s, int numRows) {
        // 줄 수가 1 또는 줄 수가 s의 길이보다 크거나 같다면 
        // 지그재그를 할 수 없다
        if(numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int idx = 0;
        int depth = 1;

        // 지그재그로 만들 2차원 배열
        List<Character>[] rows = new ArrayList[numRows];
        for(int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }

        for(char c : s.toCharArray()) {
            rows[idx].add(c);
            
            // index가 처음인 0 이라면 아래로 내리기 위해 깊이를 1
            if(idx == 0) {
                depth = 1;
            } else if(idx == numRows - 1) { // 가장 끝이면 위로 올리기 위해 -1
                depth = - 1;
            }

            idx += depth;
        }

        // 스트링빌더에 rows의 각 한 줄씩 for문을 돌려서 각 줄의 문자들을 빌더한다
        StringBuilder answer = new StringBuilder();
        for(List<Character> row : rows) {
            for(char c : row) {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}