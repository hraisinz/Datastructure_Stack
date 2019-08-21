package service;
import com.raisinz.model.Stack;

/**
 *
 * @author hardikpatel
 */
public class StackClient {
    
    public static void getStack(Stack obj){
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.getStackData();
        int poppedElement1 = obj.pop();
        System.out.println("popped data :"+poppedElement1);
        int poppedElement2=obj.pop();
        System.out.println("popped data :"+poppedElement2);
        int poppedElement3=obj.pop();
        System.out.println("popped data :"+poppedElement3);
        int poppedElement4=obj.pop();
        System.out.println("popped data :"+poppedElement4);
        obj.push(100);
        obj.getStackData();
    }
}
