package app_datastructures;

import com.raisinz.model.Stack;
import service.StackClient;

/**
 *
 * @author hardikpatel
 */
public class App_datastructures {

    public static void main(String[] args) {
        Stack s1 = new Stack(10);
        StackClient.getStack(s1);
        
    }
    
}
