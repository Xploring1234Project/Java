import java.util.*;

public class RemoveDuplicateCharsString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s= sc.nextLine();

        Set<Character> uniqueChars = new LinkedHashSet<>();

        for(char c: s.toCharArray()){
            uniqueChars.add(c);
        }

        String res = "";
        for(char c: uniqueChars){
            res+=c;
        }
        System.out.println(uniqueChars);
        System.out.println("String after removing duplicate Characters "+ res);
    }
}