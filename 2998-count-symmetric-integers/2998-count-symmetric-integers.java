class Solution {
    private int sum(String str) {
        int sum = 0;

        for(int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        return sum;
    }

    public int countSymmetricIntegers(int low, int high) {
        int result = 0;

        for(int i = low; i <= high; i++) {
            String str = Integer.toString(i);
            
            int len = str.length();
            String left = str.substring(0, len / 2);
            String right = str.substring(len / 2);

            if(len % 2 == 0 && sum(left) == sum(right)) {
                result++;
            }
        }

        return result;
    }
}