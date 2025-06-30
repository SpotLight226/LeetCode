class Solution {
    public boolean isAnagram(String s, String t) {
        // 정렬해서 같아야 anagram
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
}