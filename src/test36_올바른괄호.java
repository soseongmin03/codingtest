import java.util.Stack;

public class test36_올바른괄호 {
    boolean solution(String s){
        boolean answer = true;

        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(answer) {
                if (st.isEmpty()) { //맨처음
                    if (c == '(') st.add(c);
                    else return false;
                }else{
                    if(c == '(') st.add(c);
                    else st.pop();
                }
            }
        }
        if(st.isEmpty()) answer = true;
        else answer = false;
        return answer;
    }


    public static void main(String[] args) {
        test36_올바른괄호 sol = new test36_올바른괄호();
        System.out.println(sol.solution(")()("));
    }
}
