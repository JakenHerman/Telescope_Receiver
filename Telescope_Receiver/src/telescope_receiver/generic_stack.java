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
    private String stackType; //type of stack
    private int[] stackArray;
    private int top;

    private void main(){
        
    }
    
    static void setMax(int userMax){
        max = userMax;
    }

    void push(T x){
        System.out.println(x);
    }
    
}
