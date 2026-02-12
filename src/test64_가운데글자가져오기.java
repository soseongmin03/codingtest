public class test64_가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2 == 0){
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        }else{
            answer = s.substring(s.length()/2, s.length()/2+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        test64_가운데글자가져오기 sol = new test64_가운데글자가져오기();
        System.out.println(sol.solution("qwer"));
    }
}
