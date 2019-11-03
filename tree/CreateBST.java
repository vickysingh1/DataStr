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
class Node{
    int data;
    Node left;
    Node right;
}
class BST{
    public Node  createNewNode(int data){
        Node a=new Node();
        a.data=data;
        a.left=null;
        a.right=null;
        return a; 
    }
    public Node insert(Node node,int data){
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
}
public class CreateBST {
    public static void main(String[] args) {
        BST b=new BST();
        Node root=null;
        root=b.insert(root,8);
        root=b.insert(root,11);
        root=b.insert(root,5);
        root=b.insert(root,4);
        root=b.insert(root,15);
        root=b.insert(root,1);
        root=b.insert(root,10);
        root=b.insert(root,9);
        root=b.insert(root,3);
        root=b.insert(root,13);
      
        
    }
}
