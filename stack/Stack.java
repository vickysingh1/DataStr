/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author vicky
 */
public class Stack {
    
  
    
   
    int top=0;
    int capacity=2;
     int stack[]=new int[capacity];
    Scanner kb=new Scanner(System.in);
    public void push(int data)
    {
        if(size()==capacity)
        {
            expand();
        }
       stack[top]=data;
        top++;
       
       
    }
    public void show()
    {
       for(int i:stack)
       {
           System.out.println(i);
       }
    }
    public int pop() //delete the last element from stack
    { 
        if(top==0)
        {
            return 0;
        }
        
        int data;
        top--;
        data=stack[top];
        stack[top]=0;
        shrink();
        return data;
        }
    
    public int peek() //peek the last value inserted
    {
         if(top==0)
        {
            return 0;
        }
        int data;
        data=stack[top-1];
        return data;
        
    }
    public int size()
    {
        return top;
    }
    public void isEmpty()
    {
       
        if(size()==0)
        {
            System.out.println("no data found");
        }
        
    }

    private void expand() {
         int length=size();
         int newstack[]=new int[capacity*2];
        System.arraycopy(stack, 0,newstack, 0, length);
        stack=newstack;
        capacity*=2;
    }

    private void shrink() {
            int length=size();
            if(length<=(capacity/2)/2)
            {
                capacity=capacity/2;
            }
            int newstack[]=new int[capacity*2];
            System.arraycopy(stack, 0,newstack, 0, length);
            stack=newstack;
            
    }
    
     
}
