import java.util.Stack;

public class test67_괄호회전하기 {
    public int solution(String s) {
        int answer = 0;
        for(int i=0; i<s.length(); i++){
            if(istrue(s)) answer++; // 올바른 괄호식인지 확인
            s = cycle(s); // 문자열 회전
        }
        return answer;
    }
    private boolean istrue(String s){
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 여는 괄호일 경우 스택에 push
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // 닫는 괄호인데 스택이 비어있으면 올바르지 않음
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                // 짝이 맞는지 확인
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }

    private String cycle(String s){
        return s.substring(1)+s.charAt(0);
    }
    public static void main(String[] args) {
        test67_괄호회전하기 sol = new test67_괄호회전하기();
        System.out.println(sol.solution("{}[]()"));
    }
}
