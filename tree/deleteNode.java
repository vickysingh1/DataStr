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
class Node4{
    int data;
    Node4 left;
    Node4 right;
}
class BST4{
    public Node4  createNewNode(int data){
        Node4 a=new Node4();
        a.data=data;
        a.left=null;
        a.right=null;
        return a; 
    }
    public Node4 insert(Node4 node,int data){
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
    public Node4 delete(Node4 node,int data){
       if(node==null){
           return null;
       }
       if(data<node.data){
           node.left=delete(node.left,data);
       }else if(data>node.data){
           node.right=delete(node.right,data);
       }else{
           if(node.left==null || node.right==null){
               Node4 temp=null;
               if(node.left==null){
                   temp=node.right;
               }else{
                   temp=node.left;
               }
               if(temp==null)
                   return null;
               else{
                   return temp;
               }
           }
           else{
               Node4 successor=getSuccesor(node);
               node.data=successor.data;
               node.right=delete(node.right,4);
               return node;
           }
       }
       return node;
    }
    public Node4 getSuccesor(Node4 node){
        if(node==null){
            return null;
        }
        Node4 temp=node.right;
        while(temp!=null){
            temp=temp.left;
        }
        return temp;
    }
    public void preorder(Node4 node){
        if(node==null)
            return;
        System.out.print(node.data+" ");
        preorder(node.left);
        
        preorder(node.right);
        
    }
    
}
public class deleteNode {
    public static void main(String[] args) {
         BST4 b=new BST4();
        Node4 root=null;
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
        b.delete(root, 5);
        //System.out.println(b.delete(root, 1));
        b.preorder(root);
    }
    
}
