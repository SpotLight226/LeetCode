class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>(); // Radiant 의 queue
        Queue<Integer> dir = new LinkedList<>(); // Dire 의 queue
        int n = senate.length(); // queue에 겹치지 않는 값을 넣기위한 n

        // senate에 따라 각 queue에 값을 넣기
        for (int i = 0; i < n; i++){
            if (senate.charAt(i) == 'R'){
                rad.add(i);
            } else {
                dir.add(i);
            }
        }

        // 두 queue가 비어있지 않을 때
        while(!rad.isEmpty() && !dir.isEmpty()) {
            // dire의 가장 위의 값이 rad의 가장 위의 값보다 작다면
            if(dir.peek() < rad.peek()) {
                dir.add(n++); // dire에 n 넣고 n + 1
            } else {
                rad.add(n++); // 반대시 rad에 n 넣고 n + 1
            }

            rad.poll();
            dir.poll();
        }

        // rad
        return (rad.isEmpty()) ? "Dire" : "Radiant";
    }
}