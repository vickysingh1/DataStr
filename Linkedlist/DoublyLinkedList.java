/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

import java.util.Scanner;

/**
 *
 * @author vicky
 */
public class DoublyLinkedList {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        Node1 head=null;
        LinkedListDoubly list=new  LinkedListDoubly();
        System.out.println("Enter thr number:");
        int n=kb.nextInt();
        for(int i=0;i<n;i++)
        {
            int input=kb.nextInt();
            head=list.insert(input, head);
        }
       
        
        list.show(head);
        
        
    }
    
}
