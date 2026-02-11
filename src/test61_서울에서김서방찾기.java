public class test61_서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String seoul[] = {"jame","Kim"};
        test61_서울에서김서방찾기 sol = new test61_서울에서김서방찾기();
        System.out.println(sol.solution(seoul));
    }
}
