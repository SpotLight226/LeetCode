class Solution {
    public int removeDuplicates(int[] nums) {
        // 처음 문제를 볼 때, 단순히 중복되는 값을 제거하는 줄 알았는데(hashSet으로 고유한 요소의 개수만 구했음)
        // 배열의 중복되는 값을 제거하고 고유한 요소만을 앞으로 정렬하여 배열을 수정하는 문제였음
        if (nums.length == 0) return 0; // 길이가 0이면 0 리턴
        
        // 배열의 첫 요소(인덱스 0)은 고유함 그러므로 인덱스 1부터 시작한다
        int j = 1; // 투포인터
        for (int i = 1; i < nums.length; i++) {
            // 이전의 값이 현재의 값과 다르다면
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i]; // 투포인터(j)의 인덱스에 해당 인덱스의 값을 앞으로 이동한다
                j++; // 투포인터(인덱스 j)를 + 1
            }
        }

        return j; // 고유한 요소의 수 리턴
    }
}