import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sc[] = new int[n];
        int max = 0, sum = 0;
        for(int i = 0 ; i<n ;i++){
            sc[i] = s.nextInt();
            sum += sc[i];
            if(max < sc[i])max = sc[i];
        }
        System.out.println(sum*100.0/max/n);
    }
}
