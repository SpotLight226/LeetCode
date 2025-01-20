class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                if (i!=0) {
                    return false;
                }
                dfs(rooms, visit, i);
            }
        }
        return true;
    }

    public void dfs(List<List<Integer>> rooms, boolean[] visit, int u) {
        visit[u] = true;

        for (int v : rooms.get(u)) {
            if (!visit[v]) {
                dfs(rooms, visit, v);
            }
        }
    }
}