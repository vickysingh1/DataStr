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
public class Queue {
    
    
    int arr[]=new int[5];
    int rear;
    int front;
    int size;
    
    public void Enqueue(int data)
    {
        arr[rear]=data;
        rear++;
        size++;
    }
    public void show()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[front+i]);
        }
    }
   public int Dequeue()
   {
       int data=arr[front];
       front++;
       size--;
      
       return data;
   }
    
}
