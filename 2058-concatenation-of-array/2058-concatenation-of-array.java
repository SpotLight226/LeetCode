class Solution {
    public int[] getConcatenation(int[] nums) {
        // 반복을 위해서 nums의 길이
        int n = nums.length; 
        int[] answer = new int[2 * n]; // 2배로 만든 리턴 배열

        // 각 인덱스(i)마다 +n(nums의 길이) 해서 각 배수의 위치에 nums의 값을 넣느다
        for (int i = 0; i < n; i++) {
            answer[i] = nums[i];
            answer[i + n] = nums[i];
        }
        return answer;
    }
}