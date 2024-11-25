class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // 반환할 리스트 및 추가
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());
        
        // 각 배열의 요소들을 set에 넣는다
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> n2 = new HashSet<>();
        
        for (int n : nums1) {
            n1.add(n);
        }

        for (int n : nums2) {
            n2.add(n);
        }
        
        // 각 배열의 HashSet 의 요소가 다른 배열의 HashSet에 들어있지 않으면 겹치지 않으므로 각각의 List에 넣는다
        for (int n : n1) {
            if (!n2.contains(n)) {
                answer.get(0).add(n);
            }
        }

        for (int n : n2) {
            if (!n1.contains(n)) {
                answer.get(1).add(n);
            }
        }

        return answer;
    }
}