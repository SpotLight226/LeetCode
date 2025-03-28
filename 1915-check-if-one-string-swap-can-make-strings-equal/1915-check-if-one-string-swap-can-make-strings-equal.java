class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) {
            return true;
        }

        int i = -1;
        int j = -1;
        int count = 0; // 다른 문자의 개수

        for(int k = 0; k < s1.length(); k++) {
            // 문자가 다르면 
            if(s1.charAt(k) != s2.charAt(k)) {
                count++; // 개수 + 1

                // 개수가 1 개면, 해당 문자의 인덱스를 i에 저장
                if(count == 1) {
                    i = k;
                } else if (count == 2) { // 개수가 2개면, 위치가 다른 해당 문자의 인덱스를 j에 저장
                    j = k;
                } else { // 2개 이상 다름
                    return false;
                }
            } 
        }
        // 2개가 다르며, i,j 인덱스의 문자가 같으면 위치를 변경했을 때, 같은 문자가 됨
        if(count == 2 && s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i)) {
            return true;
        }

        return false;
    }   
}