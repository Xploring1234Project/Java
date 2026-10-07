
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class Sample{

    public static void staticMethod(String name){
        System.out.println(name);
    }

    public void instanceMethod(String fruit){
        System.out.println(fruit);

    }

    public void display(){
        System.out.println("Hello");
    }


}

public class MethodReferences {
    public static void main(String []args){

        List<String> names = new ArrayList<>();
        names.add("Harsha"); names.add("Phani"); names.add("Teja");

        // dont need to pass any args externally like ::staticMethod(name)
        //STATIC METHOD REFERENCE
        names.stream().forEach(Sample::staticMethod);

        List<String> fruits = new ArrayList<>();
        fruits.add("Orange"); fruits.add("Apple"); fruits.add("Mango");

        Sample obj = new Sample();
        
        //INSTANCE METHOD REFERENCE
        fruits.stream().forEach(obj::instanceMethod);


        // INSTANCE METHOD OF AN ARBITARY OBJECT
        fruits.forEach(System.out::println);
        //fruits.forEach(String::length); this is wrong b/c  for each is a consumer it wont return anything

        fruits.stream()
                .map(String::length)      // Returns the length (int)
                .forEach(System.out::println); // Prints the int

        
        // CONSTRUCTOR REFERENCE
        Supplier<Sample> sampleFactory = Sample::new;

        Sample obj1 = sampleFactory.get();
        obj1.display();




    }
    
}
