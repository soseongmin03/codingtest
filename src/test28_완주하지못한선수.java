import java.util.Arrays;
import java.util.Objects;

public class test28_완주하지못한선수 {
    public static void main(String[] args) {
        String part[] = {"leo", "kiki" , "eden"};
        String comp[] = {"leo", "kiki"};
        Arrays.sort(part);
        Arrays.sort(comp);
        String answer = "";
        int i;
        for(i=0; i<comp.length; i++){
            if(!Objects.equals(part[i], comp[i])) break;
        }
        if(!(i < comp.length)) answer = part[part.length-1];
        else answer = part[i];
        System.out.println(answer);
    }
}
