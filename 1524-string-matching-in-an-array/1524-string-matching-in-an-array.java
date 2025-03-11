class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                // 같은 것을 비교하지 않고, words의 요소가 다른 요소에 포함되어 있다면
                if(i != j && words[j].contains(words[i])) {
                    result.add(words[i]); // 리턴할 결과에 해당 단어를 넣고
                    break; // 포함되어 있다는 것을 알았으니 break
                }
            }
        }

        return result;
    }
}