class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        makeCombination(candidates, target, 0, new ArrayList<>(), 0, result);
        return result;    
    }

    private void makeCombination(int[] candidates, int target, int idx,
                                 List<Integer> com, int total, List<List<Integer>> result) {
        if(total == target) {
            result.add(new ArrayList<>(com));
            return;
        }

        if(total > target || idx >= candidates.length) {
            return;
        }

        com.add(candidates[idx]);
        makeCombination(candidates, target, idx, com, total + candidates[idx], result);
        com.remove(com.size() - 1);
        makeCombination(candidates, target, idx + 1, com, total, result);
    }
}