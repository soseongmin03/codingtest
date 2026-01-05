import java.util.Scanner;
import java.util.Stack;

public class test7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean result = true;
        int a[] = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = s.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        int num = 1;
        StringBuffer bf = new StringBuffer();
        for(int i = 0; i < a.length; i++){
            int su = a[i];
            if(su >= num){
                while(su >= num){
                    st.push(num++);
                    bf.append("+\n");
                }
                st.pop();
                bf.append("-\n");
            }else{
                int q = st.pop();
                if(q > su){
                    System.out.println("no");
                    result = false;
                    break;
                }else{
                    bf.append("-\n");
                }
            }
        }
        if(result) System.out.println(bf.toString());
    }
}
