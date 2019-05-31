import java.util.*;

public class MyClass {
    
    public static void main(String args[]) {
        boolean next_question = true;
        
        while(next_question){
            cal();
            System.out.println("Do you have next question?");
            next_question = new Scanner(System.in).nextBoolean();
        }
    }
    
    public static void cal(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int first_number = scanner.nextInt();
        System.out.println("Second number: ");
        int second_number = scanner.nextInt();
        
        int result = first_number + second_number;
        System.out.println("Sum: " + result);
    }
}
