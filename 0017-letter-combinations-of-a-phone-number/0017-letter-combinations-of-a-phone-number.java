class Solution {
    private void process(String digits, int idx, StringBuilder sb, List<String> result, Map<Character, String> digitToLetters) {
        if(idx == digits.length()) {
            result.add(sb.toString());
            return;
        }

        String str = digitToLetters.get(digits.charAt(idx));
        for(char c : str.toCharArray()) {
            sb.append(c);
            process(digits, idx + 1, sb, result, digitToLetters);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if(digits == null || digits.length() == 0) { return result; }

        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        process(digits, 0, new StringBuilder(), result, digitToLetters);

        return result;
    }
}