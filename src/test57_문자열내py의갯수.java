public class test57_문자열내py의갯수 {
    boolean solution(String s) {
        boolean answer = true;
        int cnty = 0;
        int cntp = 0;
        for(char c: s.toCharArray()){
            if(c == 'p' || c == 'P') cntp++;
            if(c == 'y' || c == 'Y') cnty++;
        }
        if(cntp == cnty) return answer;
        else answer = false;
        return answer;
    }

    public static void main(String[] args) {
        test57_문자열내py의갯수 sol = new test57_문자열내py의갯수();
        System.out.println(sol.solution("pPoooyY"));
    }
}
