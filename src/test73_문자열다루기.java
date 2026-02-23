public class test73_문자열다루기 {
    public boolean solution(String s) {
        boolean answer = true;
        if(!(s.length()==4 || s.length()==6)) return false;
        char[] a = s.toCharArray();
        for(char q : a){
            if(!(q >= '0' && q <= '9')) answer = false;
        }
        return answer;
    }
    public static void main(String[] args) {
        test73_문자열다루기 sol = new test73_문자열다루기();
        System.out.println(sol.solution("1234"));
    }
}
