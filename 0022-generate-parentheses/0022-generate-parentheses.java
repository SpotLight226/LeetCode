class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(result, "", 0, 0, n);
        return result;
    }

    private void dfs(List<String> result, String current, int openCount, int closeCount, int n) {
        if (openCount == n && closeCount == n) {
            result.add(current);
            return;
        }
        
        if (openCount < n) {
            dfs(result, current + "(", openCount + 1, closeCount, n);
        }
        if (closeCount < openCount) {
            dfs(result, current + ")", openCount, closeCount + 1, n);
        }
    }
}