class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // 해쉬 맵에 arr의 요소를 넣으며, 값이 있으면 디폴트 값을 0으로하여 +1 한다
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int n : arr) {
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }

        // 해쉬 셋에 해쉬 맵의 각 밸류를 넣어서 만약 요소의 개수(밸류)가 다르다면
        // 해쉬 셋은 중복이 안되므로 각 요소의 개수(해쉬 셋의 사이즈) == 맵의 사이즈(arr의 요소 개수)
        // 로 리턴한다
        Set<Integer> set = new HashSet<>();
        for(int n : hashMap.values()){
            set.add(n);
        }

        return hashMap.size() == set.size();
    }
}