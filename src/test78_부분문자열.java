public class test78_부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i=p.length(); i<=t.length(); i++){
            String num = t.substring(i-p.length(),i);
            if(Long.parseLong(num) <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        test78_부분문자열 sol = new test78_부분문자열();
        System.out.println(sol.solution("3141592","271"));
    }
}
