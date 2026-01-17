import java.util.Stack;

public class test32_괄호변환 {
    static int pos;
    static boolean isCorrect(String str){ // 문자열이 올바른 괄호문자열인지 확인
        boolean ret = true;
        int left = 0, right = 0;
        Stack<Character> mystack = new Stack<>();
        for(int i=0;i<str.length(); i++){
            if (str.charAt(i) == '(') {
                left++;
                mystack.push('(');
            }else{
                right++;
                if(mystack.empty()){ // 처음괄호가 ) 이면
                    ret = false;
                }else{
                    mystack.pop();
                }
            }
            if(left == right){ //처음 ()의 패턴이 나왔을 때
                pos = i+1;
                return ret;
            }
        }
        return ret;
    }
    static public String soluation(String p){
        if(p.isEmpty()) return p;
        boolean correct = isCorrect(p);
        String u = p.substring(0,pos);
        String v = p.substring(pos,p.length());
        if(correct) return u + soluation(v);

        String answer = "(" + soluation(v) + ")";

        for(int i=1 ; i<u.length()-1; ++i){
            if(u.charAt(i)== '(') answer += ")";
            else answer += "(";
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(soluation("()))((()"));
    }
}
