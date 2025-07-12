class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while(l < r) {
            int sum = numbers[l] + numbers[r];

            if (sum == target) { // 타겟에 맞다면, 리턴에서 순서를 넣어야 하므로 + 1 해서 리턴
                return new int[]{l + 1, r + 1};
            } else if (sum > target) { // 합계가 타켓보다 크다면, numbers 는 정렬되어 있으므로, 큰 값 인덱스인 r - 1
                r--;
            } else { // 합계가 타겟보다 작다면, 작은 값 인덱스인 l + 1
                l++;
            }
        }
        
        // 두 값의 합계가 targer가 다르기 때문에, -1, -1 리턴
        return new int[]{-1, -1};
    }
}