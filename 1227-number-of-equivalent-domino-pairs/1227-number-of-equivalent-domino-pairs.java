class Solution {
    // Cantor pairing function : 두 수 (a, b)를 순서와 상관없이 하나의 유일한 정수로 매핑
    // 
    private long cantor(int a, int b) {
        int x = Math.min(a, b); // 작은 값을 x
        int y = Math.max(a, b); // 큰 값을 y
        long sum = x + y;
        // Cantor pairing 공식: π(a, b) = (a + b)(a + b + 1) / 2 + b
        return (sum * (sum + 1)) / 2 + y;
    }

    public int numEquivDominoPairs(int[][] dominoes) {
        int result = 0;

        Map<Long, Integer> hashMap = new HashMap<>();

        for(int[] dom : dominoes) {
            // 배열의 칸토르 페어링 값
            long pairValue = cantor(dom[0], dom[1]);
            // 반복문에서 몇 개의 칸토르 페어링 값이 나왔는지 확인해서 더하기
            result += hashMap.getOrDefault(pairValue, 0); // 칸토르 페어링 값이 있을 때는 해당 개수를 없다면 0 더하기
            // 해쉬 맵에 칸토르 페어링 값의 개수를 넣는다
            hashMap.put(pairValue, hashMap.getOrDefault(pairValue, 0) + 1);
        }

        return result;
    }
}