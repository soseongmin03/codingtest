import java.util.Scanner;

public class test4_연속된자연수의합 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long num[] = new long[n];
        int count = 1, start_index = 0, end_index = 0, sum = 0;
        while(end_index < n){
            if(sum < n){
                end_index++;
                sum += end_index;
            } else if (sum > n) {
                sum -= start_index;
                start_index++;
            } else if (sum == n) {
                count++;
                end_index++;
                sum +=end_index;
            }
        }
        System.out.println(count);
    }
}
