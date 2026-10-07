import java.util.*; 

public class StringWordReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s = sc.nextLine();
        String str_arr[] = s.split(" ");

        StringBuilder result= new StringBuilder();


        for(String word : str_arr){
            result.append(new StringBuilder(word).reverse().append(" "));
        }

        System.out.println("Words reverse in String using String Builder  : " + result.toString());


        String res ="";

        for(String word : str_arr){
            String rev ="";
            for(int i=word.length()-1; i>=0;i--){
                rev+= word.charAt(i);
            }
            res += rev+" ";
        }

        System.out.println("Words reverse in String using Loops Logic  : " + res);

    }
}
