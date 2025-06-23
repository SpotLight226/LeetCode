class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        // citations 배열을 정렬
        Arrays.sort(citations);

        // n - i => 현재 인용 횟수
        for(int i = 0; i < n; i++) {
            if(citations[i] >= n - i) {
                return n - i;
            }
        }

        return 0;
    }
}