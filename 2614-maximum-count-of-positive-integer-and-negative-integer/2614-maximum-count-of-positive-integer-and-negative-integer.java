class Solution {
    public int maximumCount(int[] nums) {
        /*
        // 브루트 포스 
        int negative = 0;
        int n = nums.length;

        // 감소되지 않는 순서로 정렬된 배열을 반복
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) { // 0 이면 넘어감
                continue;
            } // 음수가 없고(앞의 요소들은 다 0), 현재 요소가 양수라면 뒤부터는 다 양수이므로 n - i 리턴
            else if (negative == 0 && nums[i] > 0) { 
                return n - i;
            } else if (nums[i] < 0) { // 음수 면 음수 개수 + 1
                negative++;
            } else if (nums[i] > 0) { // 양수 면 뒤에 요소들은 다 양수이므로, 앞의 음수 개수와 남은 요소 개수 비교해서 리턴
                return Math.max(negative, n - i);
            }
        }

        return Math.max(negative, 0); // 음수가 있다면 음수 개수 리턴, 없으면 0
        */

        // 이진 검색
        // 음수, 양수가 처음 나오는 부분을 찾아서 각 인덱스부터의 개수를 센다
        int n = nums.length;
        int l = 0; // 왼쪽
        int r = n - 1; // 오른쪽

        while(l <= r) {
            // nums의 한가운데 요소의 인덱스
            int mid = l + (r - l) / 2;
            // nums의 요소가 양수라면 
            if(nums[mid] > 0) {
                r = mid - 1; // r을 중간 인덱스보다 -1 작은 곳에 둔다 
            } else { // 음수라면 
                l = mid + 1; // 중간보다 +1 한 곳에 둔다
            }
        }

        // 양수는 왼쪽의 인덱스부터 시작된다
        int posCount = n - l;

        // 음수 찾기
        l = 0;
        r = n - 1;

        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(nums[mid] < 0) { // 음수라면 l을 중간보다 +1 곳을 찾기 위해 옮긴다
                l = mid + 1;
            } else { // 양수라면, r을 중간보다 - 1인 곳에 옮긴다
                r = mid - 1;
            }
        }
        // 음수는 오른쪽 인덱스(양수가 시작되는 인덱스) + 1 이다
        int negCount = r + 1;

        // 양수, 음수 개 중 큰 것을 반환
        return Math.max(posCount, negCount);
    }
}