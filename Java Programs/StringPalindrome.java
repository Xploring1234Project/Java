import java.util.*;


public class StringPalindrome{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String s = sc.nextLine();

        int i=0, j=s.length()-1;
        boolean pal=true;

        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                pal=false;
                break;
            }
            i++;
            j--;
        }
        
        if(pal==true)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}