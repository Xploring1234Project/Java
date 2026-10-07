import java.util.*;


public class FreqMaps{
    public static void main(String []args){
        Scanner sc=  new Scanner(System.in);

        String s = sc.nextLine();

        Map<Character,Integer> freqMap = new LinkedHashMap<>();

        for(char c : s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
        }

        freqMap.forEach((key,val)-> System.out.println(key +" : " + val));

        System.out.println(freqMap);

        for(Map.Entry<Character,Integer> entry: freqMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First non-repeated character: " + entry.getKey());
                break;
            }
        }

            freqMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .ifPresent(entry -> System.out.println("First non-repeated character: " + entry.getKey()));


            freqMap.entrySet().stream()
                    .filter(entry -> entry.getValue() >1)
                    .forEach(entry -> System.out.println("Key : "+ entry.getKey() +" => " + "Value : "+entry.getValue()));
    }


    
}