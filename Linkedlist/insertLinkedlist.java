/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

/**
 *
 * @author vicky
 */
public class insertLinkedlist {

    Node head;

    public void insert(int data) //inserting valuein the linked list
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() //showing the linked list
    {
        Node node = head;
        while (true) {
            if (node.next != null) {
                System.out.println(node.data);
                node = node.next;
            } else {
                System.out.println(node.data);
                return;
            }

        }

    }

    public void insertStart(int data) //insert into satrt of linked list
    {

        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;

    }

    public void insertAt(int index, int data) //insert data at location
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (index == 0) {
            insertStart(data);

        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) //traversing to location of new node
            {
                n = n.next;
            }
            node.next = n.next;   // point last node to new node
            n.next = node;   //point new node to nextnode
        }
    }

    public void DeleteAt(int index) {

        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("delete the value is:" + n1.data);
        }
    }

    public int getCount() //length of linked list
    {
        Node temp = head;  //make temp head
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;    //next node
        }
        return count;
    }

    public void searchElement(int data) //searching element in linked list
    {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            if (data == temp.data) {
                count++;
                System.out.println(temp.data);
                System.out.println("yes hurray");

            }
            temp = temp.next;

        }
        if (count == 0) {
            System.out.println("Your nmber is not in scope");
        }
    }

    public void reverseList(Node node) {

        Node curr = head;
        Node pre = null;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        node = pre;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
    
    public void circularLinkedlist()
    {
         Node node = head;
         boolean b=true;
        while (b) {
            if (node.next != null) {
                System.out.println(node.data);
                node = node.next;
                
            } else {
               
                System.out.println(node.data);
                 node=head;
                 System.out.println(node.data);
                 break;
                
                 
            }
            
           

        }
             
    }
}
