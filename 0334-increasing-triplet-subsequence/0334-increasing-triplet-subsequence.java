class Solution {
    public boolean increasingTriplet(int[] nums) {
        // O(n) 을 위한 방식

        // 첫 번째, 두 번째 값
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        // 인덱스는 향상된 for문으로 0 부터 시작해서 끝까지 간다 => 인덱스는 자연스럽게 i < j < k 가 된다
        for (int n : nums) {
            if(n <= first) {  // n이 첫 번째값 보다 크다면 n을 첫 번째값으로
                first = n;
            } else if (n <= second) { // n이 첫 번째 값보다 크지만 두 번째 값보단 작으면 두 번째 값을 n으로
                second = n;
            } else { // 위의 조건을 다 만족 한다는 것은 nums 배열에 첫 번째, 두 번째, 세 번째 순으로 큰 숫자가 있다는 뜻
                return true; 
            }
        }
        return false;
    }
}