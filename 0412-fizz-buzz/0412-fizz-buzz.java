class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(i % 15 == 0){ // i 가 3 과 5로 나누어 지면 즉 15로 나누었을 때 나머지가 0
                list.add("FizzBuzz");
            }else if(i % 3 == 0){ // 3으로 나누어지면 Fizz
                list.add("Fizz"); 
            }else if( i % 5 == 0){ // 5로 나누어지면 Buzz
                list.add("Buzz");
            }else{ // 3개의 조건에 해당 안 하면 그냥 숫자
                list.add(Integer.toString(i));
            }
        }

        return list;
    }
}