public class test81_이상한문자만들기 {
    public String solution(String s) {
        String answer = "";
        int i=0;
        String[] words = s.split("");
        for(int j=0; j<words.length; j++){
            for(char a : words[j].toCharArray()){

                if(i % 2 == 0){
                    answer +=  Character.toUpperCase(a);
                }else{
                    answer +=  Character.toLowerCase(a);
                }
                i++;
                if(a == ' ') i=0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        test81_이상한문자만들기 sol = new test81_이상한문자만들기();
        System.out.println(sol.solution("try hello world"));
    }
}
