import java.util.Arrays;

public class test29_전화번호목록 {
    static private boolean soluation(String phone_book[]){
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length -1 ; i++){
            if(phone_book[i+1].startsWith(phone_book[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String phone_book[] = {"1319", "7245613245", "1192356234"};
        System.out.println(soluation(phone_book));
    }
}
