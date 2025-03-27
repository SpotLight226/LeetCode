class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int domin = 0;
        int count = 0;
        int n = nums.size();

        for(int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() > n / 2) {
                domin = entry.getKey();
                count = entry.getValue();
                break;
            }
        }

        int lCount = 0;
        for(int i = 0; i < n - 1; i++) {
            if(nums.get(i) == domin) {
                lCount++;
            }

            int lSize = i + 1;
            int rSize = n - lSize;
            int rCount = count - lCount;

            if(lCount > lSize / 2 && rCount > rSize / 2) {
                return i;
            }
        }

        return -1;
    }
}