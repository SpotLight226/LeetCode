class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> row = new ArrayList<>(); // 삼각형에서 각 행

        row.add(1); // 첫 행은 1로 시작
        pascal.add(row); // 삼각형에 넣기

        for (int i = 1; i < numRows; i++) {
            row = new ArrayList<>(); // 행 초기화
            row.add(1); // 모든 행은 시작이 1

            for (int j = 1; j < i; j++) {
                // 만약 i가 3이상 이라면 위의 행에서 각각의 요소를 더한 값을 넣는다
                int n = pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j);
                row.add(n);
            }

            row.add(1); // 모든 행의 끝은 1
            pascal.add(row); // 삼각형에 행 넣기
        }
        return pascal;
    }
}