import java.util.Scanner;

public class test74_직사각형별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<b; i++){
            for(int q=0; q<a; q++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
