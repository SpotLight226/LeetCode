class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        list.add(newInterval);
        Collections.sort(list, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] curr = list.get(0);

        for(int i = 1; i < list.size(); i++) {
            int[] interval = list.get(i);

            if(curr[1] >= interval[0]) {
                curr[1] = Math.max(curr[1], interval[1]);
            } else {
                result.add(curr);
                curr = interval;
            }
        }

        result.add(curr);
        return result.toArray(new int[result.size()][]);
    }
}