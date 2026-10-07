
interface Interface1{
    void show();
}

class Display implements Interface1{

    public void show(){
        System.out.println("Lambda Function");
    }

}

interface Interface2{
    int add(int a,int b);
}

interface Interface3{
    void show();
}

interface Interface4{
    void display(String s);
}

interface Interface5{
    String showDetails(String name, int age);
}


public class LambdaFunctions {
    public static void main(String[] args) {
        
        Interface1 obj1 = new Display();
        obj1.show();

        Interface2 obj2 = (a,b) -> a+b;
        System.out.println("Addition Result " +  obj2.add(10,20));

        Interface3 obj3 = () -> System.out.println("Lambda Functions with no Args");
        obj3.show();

        Interface4 obj4  = msg -> System.out.println("Lambda with Single Args "+msg);
        obj4.display("Functional Interface");

        Interface5 obj5 = (name, age) -> {
            String result = name +" : "+age;
            return result;
        };

        System.out.println("User Details "+ obj5.showDetails("Harsha", 21));


    }
    
}
