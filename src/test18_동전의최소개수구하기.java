import java.util.Scanner;

public class test18_동전의최소개수구하기 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int price = s.nextInt();
        int coin[] = new int[n];
        int coins = 0;
        for(int i=0; i<n ; i++){
            coin[i] = s.nextInt();
        }
        for(int i=n-1 ;i>=0; i--){
            int num = price / coin[i];
            if(num > 0){
                price = price % coin[i];
                coins += num;
            }
        }
        System.out.println(coins);
    }
}
