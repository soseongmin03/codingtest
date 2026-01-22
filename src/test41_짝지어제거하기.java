import java.util.Stack;

public class test41_짝지어제거하기 {

    public static void main(String[] args) {
        test41_짝지어제거하기 sol = new test41_짝지어제거하기();
        System.out.println(sol.solution("cdcd"));
    }

    private int solution(String s) {
        char c[] = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<c.length; i++){
            if(st.isEmpty()){
                st.push(c[i]);
            }else if(st.peek() == c[i]){ //현재 문자와 직전에 저장한 문자가 같음
                st.pop();
            }else{
                st.push(c[i]);
            }
        }
        if(st.isEmpty()) return 1;
        else return 0;
    }
}
