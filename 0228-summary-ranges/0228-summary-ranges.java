class Solution {
    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        List<String> list = new ArrayList<>();
        if(len == 0) {
            return list;
        }
        
        int start = nums[0];

        for(int i = 1; i <= len; i++) {
            if(i == len || nums[i] != nums[i - 1] + 1) {
                if(start == nums[i - 1]) {
                    list.add(String.valueOf(start));
                } else {
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