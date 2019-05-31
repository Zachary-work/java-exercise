
import java.util.*;

public class MyClass {
    
    public static void main(String args[]) {
        boolean next_question = true;
        
        while(next_question){
            cal();
            next_question = hasNext();
        }
        
        System.out.println("Thanks for using");
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
    
    public static boolean hasNext(){
        boolean input_invalid = true;
        String str_next_question = "";
        while(input_invalid){
            System.out.println("Do you have next question?");
            str_next_question = new Scanner(System.in).nextLine();
            if(str_next_question.equals("true") || str_next_question.equals("false")){
                input_invalid = false;
            }
        }
        if(str_next_question.equals("true")){
            return true;
        }
        return false;
    }
}
