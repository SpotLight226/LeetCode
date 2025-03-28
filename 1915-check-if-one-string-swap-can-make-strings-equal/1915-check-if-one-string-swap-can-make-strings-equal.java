class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) {
            return true;
        }

        int i = -1;
        int j = -1;
        int count = 0;

        for(int k = 0; k < s1.length(); k++) {
            if(s1.charAt(k) != s2.charAt(k)) {
                count++;

                if(count == 1) {
                    i = k;
                } else if (count == 2) {
                    j = k;
                } else { // 2개 이상 다름
                    return false;
                }
            } 
        }

        if(count == 2 && s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i)) {
            return true;
        }

        return false;
    }   
}