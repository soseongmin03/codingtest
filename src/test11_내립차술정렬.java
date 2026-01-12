import java.util.Scanner;

public class test11_내립차술정렬 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num = s.next();
        int a[] = new int[num.length()];
        for(int i = 0; i<num.length() ; i++){
            a[i] = Integer.parseInt(num.substring(i,i+1));
        }
        for(int i = 0 ; i<num.length(); i++){
            int Max = i;
            for(int j = i+1; j<num.length(); j++){
                if(a[j] > a[Max]) Max = j;
            }
            if(a[i] < a[Max]){
                int temp = a[i];
                a[i] = a[Max];
                a[Max] = temp;
            }
        }
        for(int i = 0; i<num.length() ; i++){
            System.out.print(a[i]);
        }
    }
}
