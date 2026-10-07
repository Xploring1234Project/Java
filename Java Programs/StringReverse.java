import java.util.*;

public class StringReverse{

    public static String strReverseLoop(String s){

        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        return rev;
    }

    public static String strReverseBuilder(String s){
        StringBuilder sb = new StringBuilder(s);

        String rev = sb.reverse().toString();
        return  rev;
    }

    public static String strReverseRecursion(String s){

        if(s.length()==0) return "";
        return strReverseRecursion(s.substring(1))+s.charAt(0);
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the String to reverse  ");
        String s = sc.nextLine();

        System.out.println("String Reverse using loop "+ strReverseLoop(s));

        System.out.println("String Reverse using Builder "+ strReverseBuilder(s));

        System.out.println("String Reverse using Recursion "+ strReverseRecursion(s));
    }
}