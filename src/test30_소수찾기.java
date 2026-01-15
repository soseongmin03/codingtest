import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class test30_소수찾기 {
    static HashSet<Integer> numberset = new HashSet<>();
    static public void recursive(String comb, String others){
        if(!comb.equals(""))
            numberset.add(Integer.valueOf(comb));
        for(int i =0; i<others.length(); i++){
            recursive(comb + others.charAt(i), others.substring(0,i) + others.substring(i+1));
        }
    }
    static public int soluation(String number){
        int count = 0;
        recursive("",number);
        System.out.println(numberset);
        Iterator<Integer> it = numberset.iterator();
        while(it.hasNext()){
            int numbers = it.next();
            if(isPrime(numbers)) count++;
        }
        return count;
    }

    private static boolean isPrime(int numbers) {
        if(numbers == 0 || numbers == 1) return false;
        for(int i=2; i<=Math.sqrt(numbers); i++){
            if(numbers % i ==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(soluation("17"));
    }
}
