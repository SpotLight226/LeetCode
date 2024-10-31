class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int n1 = str1.length();
        int n2 = str2.length();

        while (n2 > 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        return str1.substring(0, n1);
    }
}