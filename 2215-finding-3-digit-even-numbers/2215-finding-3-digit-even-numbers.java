class Solution {
    public int[] findEvenNumbers(int[] digits) {
        // digits 배열 숫자들의 개수
        int[] mpp = new int[10]; 
        for(int n : digits) {
            mpp[n]++;
        }

        List<Integer> list = new ArrayList<>();

        // 3자리 숫자이므로, 첫 자리인 i는 1부터 시작
        for(int i = 1; i <= 9; i++) {
            // 빈도 배열에서 첫 자리에 올 숫자가 없다면, 스킵 
            if(mpp[i] == 0) {
                continue;
            }

            mpp[i]--; // 한 자리를 썼으므로 -1

            // 두 번째 자리, 0부터 시작해도 상관 X
            for(int j = 0; j <= 9; j++) {
                // 두 번째 자리에 들어올 숫자가 없다면 스킵
                if(mpp[j] == 0) { 
                    continue;
                }
                // 있으면, -1
                mpp[j]--;
                
                // 짝수를 찾아야 하므로, k는 0부터 8까지, 2 씩 증가
                for(int k = 0; k <=8; k+=2) {
                    if(mpp[k] == 0) {
                        continue;
                    }

                    // list에 i, j, k 를 각 위치에 맞추어 list에 넣기
                    list.add(i * 100 + j * 10 + k);
                }

                mpp[j]++; // 사용한 자리 수를 복구
            }
            mpp[i]++; // 사용한 자리 수를 복구
        }  

        // list를 int배열로 반환하기 위해서 stream
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}