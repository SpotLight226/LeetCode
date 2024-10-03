class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        row.add(1);
        pascal.add(row);

        for (int i = 1; i < rowIndex + 1; i++) {
            row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                int n = pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j);
                row.add(n);
            }

            row.add(1);
            pascal.add(row);
        }

        return pascal.get(rowIndex);
    }
}