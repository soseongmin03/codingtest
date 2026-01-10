import java.util.Scanner;

public class test19 {
    static int answer;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String math = s.nextLine();
        String str[] = math.split("-");
        for(int i=0; i< str.length ; i++){
            int temp = mysum(str[i]);
            if(i == 0){
                answer += temp;
            }else{
                answer -= temp;
            }
        }
        System.out.println(answer);
    }

    private static int mysum(String s) {
        int sum = 0;
        String temp[] = s.split("[+]");
        for(int i=0; i< temp.length ; i++){
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
