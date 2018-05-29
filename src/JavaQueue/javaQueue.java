/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaQueue;

/**
 *
 * @author mikeg
 */
public class javaQueue {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(11);
        queue.push(13);
        queue.push(7);
        
        System.out.println(queue.pop());
        
        queue.push(9);
        queue.push(-5);
        
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());        
        System.out.println(queue.pop());
        
}
    
}
