class Solution {
    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        List<String> list = new ArrayList<>();
        // 길이가 0이라면, 범위 구분 필요 X
        if(len == 0) {
            return list;
        }
        
        int start = nums[0];

        for(int i = 1; i <= len; i++) {
            // 현재 인덱스가 길이와 같거나, 이전 요소가 현재 요소 + 1 과 같지 않다면
            if(i == len || nums[i] != nums[i - 1] + 1) {
                // 이전 요소와 현재 요소가 동일하면 list 에 넣기
                if(start == nums[i - 1]) {
                    list.add(String.valueOf(start));
                } else { // 요소의 범위 설정
                    list.add(start + "->" + nums[i - 1]);
                }
                
                if(i < len) {
                    start = nums[i];
                }
            }
        }

        return list;
    }

}