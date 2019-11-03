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
class Node6{
    int data;
    Node6 left;
    Node6 right;
}
class BST6{
    public Node6  createNewNode(int data){
        Node6 a=new Node6();
        a.data=data;
        a.left=null;
        a.right=null;
        return a; 
    }
    public Node6 insert(Node6 node,int data){
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
    public Node6 getInorder(Node6 node){
        if(node==null){
            return null;
        }
        Node6 temp=node.right;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }
    public Node6 getInorderSuccessor(Node6 node,int data){
        if(node==null){
            return null;
        }
        Node6 inord=null;
        while(node!=null){
            if(data<node.data){
                inord=node;
                node=node.left;
                
            }
            else if(data>node.data){
                node=node.right;
            }else{
                if(node.right!=null){
                inord=getInorder(node);
            }
                break;
            }
          
        }
          return node!=null ? inord:null;
    }
}
public class inOrderSuccessor {
    public static void main(String[] args) {
         BST6 b=new BST6();
        Node6 root=null;
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
        
        Node6 inorderS=b.getInorderSuccessor(root, 7);
        if(inorderS!=null){
            System.out.println(inorderS.data);
        }else{
            System.out.println("Inorder Successor doesn't exists");
        }
    }
    
}
