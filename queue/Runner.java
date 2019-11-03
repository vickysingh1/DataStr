/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author vicky
 */
public class Runner {
    public static void main(String[] args) {
        Queue qu=new Queue();
        qu.Enqueue(10);
        qu.Enqueue(20);
        qu.Enqueue(30);
        qu.Enqueue(40);
        //qu.Enqueue(50);
//       qu.show();    
       qu.Dequeue();
       qu.show();
    }
    
    
}
