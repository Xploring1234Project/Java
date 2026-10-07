
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;




public class InBuiltFunctionalInterfaces {
    public static void main(String[] args) {
        
        Predicate<Integer> isEven = num -> num%2==0;
        System.out.println("Is Even " + isEven.test(15));

        BiPredicate<String, Integer> isStrLengthGreater = (str, len) -> str.length() >len;
        System.out.println("Is String length Greater than given Length "+ isStrLengthGreater.test("Harsha", 5));

        Function<String,Integer> strLength = str -> str.length();
        System.out.println("Length of String " + strLength.apply("Harsha"));

        BiFunction<Integer,Integer,Integer> sum = (a,b) -> a+b;
        System.out.println("Sum  "+  sum.apply(10, 10));

        Consumer<String> print = msg -> System.out.println("Hello "+ msg);
        print.accept("Harsha");

        BiConsumer<String,Integer> display = (name,age) -> System.out.println("Name : "+ name +" Age : "+age);
        display.accept("Harsha", 21);

        Supplier<Double> random = () -> Math.random();
        System.out.println("Random Value " + random.get());

        // Takes the one input and returns the same type
        UnaryOperator<Integer> square = n -> n*n;
        System.out.println("Square  " + square.apply(10));

        //Takes two inputs and returns the same type
        BinaryOperator<Integer> multiply = (a,b) -> a*b;
        System.out.println("Multiply "+ multiply.apply(10, 20));

        
    }
    
}
