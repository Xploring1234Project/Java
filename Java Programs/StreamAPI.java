
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPI {
    public static void main(String [] args){
        //List<String> names = new ArrayList<>();
        List<String> names  =  Arrays.asList("Harsha","Hemanth","Jayanth","Karthik","Gowtham","Roshan","Nithin","Mahesh","Nikhil","Dinesh");

        //FILTERING
        names.stream().filter(name -> name.toLowerCase().startsWith("h")).forEach(System.out::println);

        names.stream().filter(name  -> name.length()>6).forEach(System.out::println);
        
        //MAPPING
        List<Integer> lengths = names.stream().map(String::length).collect(Collectors.toList());
        lengths.forEach(System.out::print);

        //REDUCE
        int lengthsum = lengths.stream().reduce(0,(a,b)->a+b);
        System.out.println("\n Lengths Sum " + lengthsum);

        //SORTING
        names.stream().sorted().forEach(System.out::println);


        List<String> sortednames = names.stream()
                                .filter(name -> name.length()>=6)
                                .map(String::toUpperCase)
                                .sorted()
                                .collect(Collectors.toList());
        sortednames.forEach(System.out::println);


        List<List<String>> complexList = Arrays.asList( Arrays.asList("Java", "Spring"),
                                                        Arrays.asList("Python", "Django"),
                                                        Arrays.asList("SQL", "NoSQL"));

        List<String> courses = complexList.stream()
                                .flatMap(List::stream)
                                .collect(Collectors.toList());
        System.out.println(courses);

        //DISTINCT
        List<Integer> nums = Arrays.asList(1,3,2,4,2,2,3,4,1);

        nums.stream().distinct().forEach(System.out::print);
        System.out.println("");

        //SKIP and LIMIT

        nums.stream()
            .skip(2) // skips first 2 nums 
            .limit(3) //takes next 3 nums
            .forEach(System.out::println);

        //ANY MATCH -- ALL MATCH -- NONE MATCH

        boolean allEven  = nums.stream().allMatch(n -> n % 2 == 0);
        boolean anyGreaterThanFive = nums.stream().anyMatch(n -> n>5);
        boolean noneNegative  = nums.stream().noneMatch(n -> n<0);
        System.out.println("All are even " + allEven);
        System.out.println("Any Greater than five " + anyGreaterThanFive);
        System.out.println("No element is negative " + noneNegative);




    }
    
}
