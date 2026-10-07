
class Single{

    public static Single instance;

    public static Single getInstance(){
        if(instance==null){
            instance= new Single();
        }

        return instance;
    }

    public void showMessage(){
        System.out.println("Hello from the Single!");
    }
}


public class Practise {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Single first = Single.getInstance();
        Single second = Single.getInstance();

        System.out.println("Are both instances the same? " + (first == second));

    }
}