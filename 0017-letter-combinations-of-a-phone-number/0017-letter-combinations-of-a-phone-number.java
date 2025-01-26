class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();

        // 입력이 없거나(null), 입력이 안되있다면 그냥 빈 배열 리턴
        if(digits == null || digits.length() == 0) return answer;

        // Map에서 key 는 각 숫자로 value를 각 숫자에 해당하는 문자열
        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), answer, digitToLetters);

        return answer;
    }

    private void backtrack(String digits, int idx, StringBuilder sb,
                           List<String> answer, Map<Character, String> digitToLetters) {

        if (idx == digits.length()) {
            answer.add(sb.toString());
            return;
        }
        
        String letters = digitToLetters.get(digits.charAt(idx));

        for (char letter : letters.toCharArray()) {
            sb.append(letter);
            backtrack(digits, idx + 1, sb, answer, digitToLetters);
            sb.deleteCharAt(sb.length() - 1);
        }
    } 
}