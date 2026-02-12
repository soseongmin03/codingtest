public class test63_핸드폰번호가리기 {
    public String solution(String phone_number) {
        StringBuilder an = new StringBuilder();
        String answer = "";
        for(int i=0; i<phone_number.length(); i++){
            if(i>=phone_number.length()-4){
                an.append(phone_number.charAt(i));
            }else{
                an.append("*");
            }
        }

        return String.valueOf(an);
    }
    public static void main(String[] args) {
        test63_핸드폰번호가리기 sol = new test63_핸드폰번호가리기();
        System.out.println(sol.solution("01033334444"));
    }
}
