/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author vicky
 */
class Node2{
    int data;
    Node2 left;
    Node2 right;
}
class BST2{
    public Node2  createNewNode(int data){
        Node2 a=new Node2();
        a.data=data;
        a.left=null;
        a.right=null;
        return a; 
    }
    public Node2 insert(Node2 node,int data){
        if(node==null)
        {
            return createNewNode(data);
        }
        if(data<node.data){
            node.left=insert(node.left,data);
        }else if(data>node.data){
            node.right=insert(node.right,data);
        }
        return node;
    } 
     public void preorder(Node2 node){
        if(node==null)
            return;
        System.out.print(node.data+" ");
        preorder(node.left);
        
        preorder(node.right);
        
    }
}
public class PreorderTrsversal {
    public static void main(String[] args) {
        BST2 b=new BST2();
        Node2 root=null;
        root=b.insert(root,8);
        root=b.insert(root,3);
        root=b.insert(root,6);
        root=b.insert(root,10);
        root=b.insert(root,4);
        root=b.insert(root,7);
        root=b.insert(root,1);
        root=b.insert(root,14);
        
        root=b.insert(root,13);
        b.preorder(root);
    }
}
