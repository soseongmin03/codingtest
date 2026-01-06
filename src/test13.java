import java.util.Scanner;

public class test13 {
    static boolean v[];
    static int num[];
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        v = new boolean[n];
        num = new int[n];
        backtracking(0);
    }
    private static void backtracking(int length) {

        if(length == m){
            printArray();
            return;
        }
        for(int i = 0 ; i<n ; i++){
            if(v[i] == false){
                v[i] = true;
                num[length] = i;
                backtracking(length + 1);
                v[i] = false;
            }
        }
    }
    private static void printArray(){
        for(int i = 0 ; i<m ; i++){
            System.out.print(num[i] + 1 +" ");
        }
        System.out.println("");
    }
}
