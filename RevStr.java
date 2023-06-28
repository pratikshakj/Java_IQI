import java.util.*;
public class RevStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char[] s = sc.nextLine().toCharArray();
        
        int k, i=0, j=s.length-1;
        for(k=0; k<s.length/2; k++) {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++; j--;
            }
            for(k=0; k<s.length; k++) {
            System.out.print(s[k]);
            }
            }
}