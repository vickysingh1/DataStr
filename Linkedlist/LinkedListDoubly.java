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
public class LinkedListDoubly {

    // Node1 head=null;
    public Node1 getNewNode(int data) {
        Node1 node = new Node1();
        node.data = data;
        node.pre = null;
        node.next = null;

        return node;
    }

    public Node1 insert(int data, Node1 node) {
        if (node == null) {
            return getNewNode(data);
        }
        Node1 head = node;
        while (node.next != null) {
            node = node.next;
        }
        Node1 n = getNewNode(data);
        n.pre=node;
        node.next=n;
        return head;
        

    }
    public void show(Node1 node)
    {
        
        while(node!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
    }

}
