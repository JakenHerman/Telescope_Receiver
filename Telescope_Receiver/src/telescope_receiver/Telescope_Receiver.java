
package telescope_receiver;
import java.util.*;

/**
 *
 * @author jaken herman
 */
public class Telescope_Receiver extends generic_stack{

    public static void main(String[] args) {
        String stackType;
        Integer max = null; //size of stack
        int default_stack = 5;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input Stack Size: ");
        while ((max == null) || !(max > 0)){
            try {
                max = scan.nextInt();
            } catch (InputMismatchException e){
                max = default_stack;
                System.out.println("Invalid input. Stack size has defaulted to 5.");
              }
        }
      
        System.out.println("Input Stack Type: ");
        stackType = scan.next();

        
        if (stackType.equalsIgnoreCase("string")){
              generic_stack<String> stringStack = new generic_stack();  
              stringStack.push("Push successfull");
              generic_stack.setMax(max);
        }
        
        else if ((stackType.equalsIgnoreCase("int")) || (stackType.equalsIgnoreCase("integer"))){
            generic_stack<Integer> intStack = new generic_stack();
            generic_stack.setMax(max);
        }
        
        else {
            System.out.println("Invalid stack type. Stack has defaulted to String type.");
              generic_stack<String> stringStack = new generic_stack(); 
              generic_stack.setMax(max);
        }
           
    }
}
