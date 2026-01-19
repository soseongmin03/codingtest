

public class test35_문자열만들기 {
    public String solution(String s){
        StringBuilder answer = new StringBuilder();
        boolean first = true;
        for(char c : s.toCharArray()){
            if(c == ' '){
                answer.append(c);
                first = true;
            }else if(first){
                answer.append(Character.toUpperCase(c));
                first = false;
            }else{
                answer.append(Character.toLowerCase(c));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        test35_문자열만들기 sol = new test35_문자열만들기();
        System.out.println(sol.solution("3people unFollowed me"));

    }
}
