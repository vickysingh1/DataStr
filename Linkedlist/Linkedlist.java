/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

//import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author vicky
 */
public class Linkedlist {

    public static void main(String[] args) {
//        LinkedList list=new LinkedList();  //Using Collection API 
//        for(int i=0;i<20;i=i+2)
//        {
//            list.add(i);
//        }
//       
//        for(Object i:list)
//        {
//            System.out.println(i);
//        }
        Node node = new Node();
        insertLinkedlist list = new insertLinkedlist();
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            int input = kb.nextInt();
            list.insert(input);
        }

        System.out.println("----------------------------");
        //list.show();
        System.out.println("----------------------------");
        //list.insertStart(9);

        // list.show();
        System.out.println("-----------------------------");
        // list.insertAt(2, 69);
        System.out.println("----------------------------");
        list.insertAt(0, 13);
        System.out.println("----------------------------");
        list.show();
        list.DeleteAt(0);
        System.out.println("------------------------------");
        list.show();

        System.out.println("Length of linked List:" + list.getCount());
        System.out.println("enter the number you want to search");
        int d = kb.nextInt();
        list.searchElement(d);
        System.out.println("------------------------------");
        list.reverseList(node);
        list.circularLinkedlist();

    }

}
