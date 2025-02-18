class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int answer = 0;
        int majority = 0;

        for(int n : nums) {
            // n이 해쉬맵에 없으면, 개수를 1 ( +0 ) 로, 있다면 개수 에 + 1 
            hashMap.put(n, 1 + hashMap.getOrDefault(n, 0));

            // n 의 개수가 가장 많은 개수보다 크다면 
            if(hashMap.get(n) > majority) {
                answer = n; // 리턴 값 변경
                majority = hashMap.get(n); // 가장 많은 개수
            }
        }

        return answer;
    }
}