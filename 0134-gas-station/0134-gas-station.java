class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasTotal = 0; // 총 연료
        int costTotal = 0; // 총 이동에 사용하는 연료
        for(int i = 0; i < gas.length; i++) {
            gasTotal += gas[i];
            costTotal += cost[i];
        }

        // 총 연료가 총 이동 연료보다 작다면, 절대로 한 바퀴 돌 수 없으므로 -1 리턴
        if(gasTotal < costTotal) {
            return - 1;
        }

        int gasCurr = 0;
        int start = 0;

        for(int i = 0; i < gas.length; i++) {
            // 현재 연료 : 현재 주유소에서 충전하는 연료 - 이동에 쓰는 연료
            gasCurr += gas[i] - cost[i];

            // 현재 연료가 0보다 작다면, 다음 주유소로 이동할 수 없다는 뜻이므로
            // 현재 연료 초기화 후, 시작 지점을 변경 
            if(gasCurr < 0) {
                gasCurr = 0;
                start = i + 1;
            }
        }

        return start;
    }
}