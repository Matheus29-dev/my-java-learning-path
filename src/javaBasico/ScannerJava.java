import java.time.LocalDate;
import java.util.Scanner;

public class ScannerJava {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("write your name and age: ");
        String name = obj.nextLine();
        int age = obj.nextInt();

        System.out.println("your name is "+ name+" and your age is "+ age);
        
        LocalDate obj2 = LocalDate.now();

        System.out.println(obj2);


    }

}
