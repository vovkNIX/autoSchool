import com.welcome.Hello;

public class Main {
    public static void main(String[] args) {

        Hello person;
        person = new Hello();
        person.setupName();
        person.welcome();
        System.out.println("Hello world!");
        person.byeBay();
    }
}