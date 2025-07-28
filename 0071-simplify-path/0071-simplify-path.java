class Solution {
    public String simplifyPath(String path) {
        // 경로를 /를 기준으로 잘라서 배열로
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String str : arr) {
            // 배열 요소가 "" or . 이라면 넘어감
            if(str.equals("") || str.equals(".")) {
                continue;
            }

            //.. 은 상위 디렉터리를 나타내므로 기존 stack 에 경로가 있다면, 빼기
            if(str.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else { // 없으면, ..을 넣어서 상위 디렉터리 보여주기
                stack.push(str); 
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.insert(0, "/" + stack.pop());
        }

        if(sb.length() == 0) {
            return "/";
        } else {
            return sb.toString();
        }
    }
}