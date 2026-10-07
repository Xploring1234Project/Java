
import java.util.*;

public class StringAnagram{

    public static boolean sortAndCompare(String s1, String s2){
        boolean isAnagram= true;
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2)){
            isAnagram = true;
        }else{
            isAnagram=false;
        }
        
        return isAnagram;
    }

    public static boolean frequencyCountCheck(String s1, String s2){
        boolean isAnagram=true;
        int freq_count[] = new int[256];

        for(char c : s1.toCharArray()){
            freq_count[c]+=1;
        }

        for(char c : s2.toCharArray()){
            freq_count[c]-=1;
        }

        for(int i : freq_count){
            if(i!=0){
                isAnagram = false;
                break;
            }
        }

        return isAnagram;
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        
        if(s1.length()!= s2.length()){
           System.out.println("Not Anagram ");
           return;
        }


        System.out.println("Anagram Check using Sort and Compare " + sortAndCompare(s1, s2));
        System.out.println("Anagram Check using Frequency Count  " + frequencyCountCheck(s1, s2));

    }
}