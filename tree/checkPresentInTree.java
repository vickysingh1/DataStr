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
class Node5{
    int data;
    Node5 left;
    Node5 right;
}
class BST5{
    public Node5  createNewNode(int data){
        Node5 a=new Node5();
        a.data=data;
        a.left=null;
        a.right=null;
        return a; 
    }
    public Node5 insert(Node5 node,int data){
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
    public String ifPresentOrNot(Node5 node,int data){   //check value is exits or not this method is using to check
        if(node==null){
            return "No";
        }
        String ispresent="Not";
        while(node!=null){
            if(data<node.data){
                node=node.left;
            }else if(data>node.data){
                node=node.right;
            }
            else{
                ispresent="Yes";
                break;
            }
        }
        return ispresent;
    }
    public Node5 getTheParentNode(Node5 node,int data){  //ths method is using to geet the parent node of data
        if(node==null){
            return null;
        }
        Node5 storeNodeprevious=null;
        while(node!=null){
        if(data<node.data){
            storeNodeprevious=node;
            node=node.left;
        }
        else if(data>node.data){
            storeNodeprevious=node;
            node=node.right;
        }
        else{
            break;
        }
        }
        return node!=null ? storeNodeprevious:null;
    }
    public Node5 checkSibilling(Node5 node,int data){  //this method is using to check the sibillingof the node
        if(node==null || node.data==data)
            return null;
        
        Node5 previousnode=null;
        while(node!=null){
            if(data<node.data){
                previousnode=node;
                node=node.left;
            }
            else if(data>node.data){
               previousnode=node;
               node=node.right;
            }
            else{
                break;
            }
        }
        if(previousnode.left!=null && data==previousnode.left.data ){
            return previousnode.right;
        }
        if(previousnode.right!=null && data==previousnode.right.data){
           return previousnode.left; 
        }
        return null;
    }
}
public class checkPresentInTree {
    public static void main(String[] args) {
          BST5 b=new BST5();
        Node5 root=null;
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
        
       // System.out.println(b.ifPresentOrNot(root,134));// this is calling of method to exists or not
//        Node5 getnode=b.getTheParentNode(root, 1);
//        if(getnode!=null){
//            System.out.println(getnode.data);
//        }
//        else{
//            System.out.println("not present the parent node");
//        }


         Node5 getsibilling=b.checkSibilling(root, 8);   //thid method calling to use tho check sibbling of the node
         if(getsibilling!=null){
             System.out.println(getsibilling.data);
         }else{
             System.out.println("Not sibilling found");
         }
    }
    
    
}
