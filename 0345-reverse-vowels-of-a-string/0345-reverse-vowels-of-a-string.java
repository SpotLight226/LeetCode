import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        // a, e, i, o, u 가 있는 지를 확인하기 위한 set
        // hashSet을 생성할 때, Array.asList로 리스트를 만들어 건네줌
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] arr = s.toCharArray(); // s를 문자 배열로

        int start = 0; // 시작
        int end = s.length() - 1; // 끝

        while (start < end) {
            // 앞이랑 뒤에서 포인터를 이용해 선택하여 둘 다 문자라면 
            if (set.contains(arr[start]) && set.contains(arr[end])) {
                char temp = arr[start]; // 임시 문자
                arr[start] = arr[end]; // 뒤의 문자를 앞으로
                arr[end] = temp; // 뒤의 문자를 임시 문자로
                start++; // 포인터 이동
                end--;
            } else if (!set.contains(arr[start])) { // 처음 포인터에서 문자 없으면 start++
                start++;
            } else { // 뒤에 포인터에 없으면 end--
                end--;
            }
        }

        return new String(arr); // 새로운 문자열을 만들어 리턴
    }
}