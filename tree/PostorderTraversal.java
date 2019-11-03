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
class Node3{
    int data;
    Node3 left;
    Node3 right;
}
class BST3{
    public Node3  createNewNode(int data){
        Node3 a=new Node3();
        a.data=data;
        a.left=null;
        a.right=null;
        return a; 
    }
    public Node3 insert(Node3 node,int data){
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
    public void postorder(Node3 node){
        if(node==null)
            return;
        postorder(node.left);
        
        postorder(node.right);
        System.out.print(node.data+" ");
        
    }
}
public class PostorderTraversal {
    public static void main(String[] args) {
        BST3 b=new BST3();
        Node3 root=null;
        root=b.insert(root,8);
        root=b.insert(root,3);
        root=b.insert(root,6);
        root=b.insert(root,10);
        root=b.insert(root,4);
        root=b.insert(root,7);
        root=b.insert(root,1);
        root=b.insert(root,14);
        
        root=b.insert(root,13);
        b.postorder(root);
    }
}
