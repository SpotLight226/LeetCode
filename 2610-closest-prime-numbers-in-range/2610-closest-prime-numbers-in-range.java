class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] prime = new boolean[right + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false; // 0,1은 소수 아님

        // 에라토스테네스의 체
        for(int i = 2; i * i <= right; i++) {
            if(prime[i]) { // i가 소수라면
                for(int j = i * i; j <= right; j += i) {
                    prime[j] = false; // i의 배수는 소수가 아님
                }
            }
        }
        // left, right 사이의 소수를 리스트로
        List<Integer> primes = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            if(prime[i]) {
                primes.add(i);
            }
        }

        // 소수 개수가 2개 미만이면 -1, -1 리턴
        if(primes.size() < 2) {
            return new int[]{-1, -1};
        } 

        int minGap = Integer.MAX_VALUE; // 최소 갭
        int[] result = {0, 0};

        // 2번째 요소부터 시작
        for(int i = 1; i < primes.size(); i++) {    
            int gap = primes.get(i) - primes.get(i - 1); // 요소의 갭을 구함
            if(gap < minGap) { // 갭이 현재 최소 갭보다 작으면 각 요소를 배정
                minGap = gap;
                result[0] = primes.get(i - 1);
                result[1] = primes.get(i);
            }
        }

        return result;

    }
}