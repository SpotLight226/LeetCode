class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE; // 인트형의 최소값을 max의 기본값

        for(int i = 0; i < candies.length; i++) {
            if(max < candies[i]) max = candies[i];
        }

        // 현재 캔디에 추가 캔디를 더해서 기존 사탕배열의 최대값보다 크거나 같다면 true
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;    
    }
}