import java.util.Scanner;

public class test1_숫자의합구하기 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        char num[] = new char[n];
        num = s.next().toCharArray();
        for(int i= 0; i<n;i++){
            sum += num[i] - 48;
        }
        System.out.println(sum);
    }
}
