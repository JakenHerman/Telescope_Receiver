/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telescope_receiver;

/**
 *
 * @author jaken herman
 * @param <T>
 */
public class generic_stack<T> {
    
    static int max; //size of stack
    private int top;
    private int EMPTY = -1;
    private T stackArray[];
    
    private void main(){
        top = EMPTY;
    }
    
    static void setMax(int userMax){
        max = userMax;
    }

    void push(T x){
        if(top < (max -1)){
            stackArray[++top] = x;
        }
    }
    
    void pop(){
        if (top != EMPTY){
            System.out.println(stackArray[top--] + " has been popped from the stack");
        }
        else {
            System.out.println(0);
        }
    }
    
    boolean empty(){
        if (top == EMPTY){
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean full(){
        if (top == (max - 1)){
            return true;
        }
        else {
            return false;
        }
    }
}
