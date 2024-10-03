class Solution {
    public List<Integer> getRow(int rowIndex) {
        /* 모든 파스칼 삼각형을 만드는 방법
        // 파스칼 삼각형 만들기
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        row.add(1); // 첫 행은 1부터 시작
        pascal.add(row); // 첫 행 넣기

        for (int i = 1; i < rowIndex + 1; i++) {
            row = new ArrayList<>(); // 행 초기화
            row.add(1); // 모든 행 시작은 1

            // 행이 3보다 크다면 이전 행의 각각의 요소를 더해 n을 만들고 행에 넣는다
            for (int j = 1; j < i; j++) {
                int n = pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j);
                row.add(n);
            }

            row.add(1); // 모든 행의 끝은 1
            pascal.add(row); // 행 넣기
        }

        return pascal.get(rowIndex); // 해당 행 리턴
        */

        // 해당 행만 만드는 방법
        List<Integer> row = new ArrayList<>();
        row.add(1); // 모든 행 시작은 1

        for(int i = 1; i < rowIndex + 1; i++){
            for(int j = i - 1; j > 0; j--){
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
        }

        return row;
    }
}