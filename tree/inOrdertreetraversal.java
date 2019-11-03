
package tree;
class Node1{
    int data;
    Node1 left;
    Node1 right;
}
class BST1{
    public Node1  createNewNode(int data){
        Node1 a=new Node1();
        a.data=data;
        a.left=null;
        a.right=null;
        return a; 
    }
    public Node1 insert(Node1 node,int data){
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
    public void inorder(Node1 node){
        if(node==null)
            return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
        
    }
}
public class inOrdertreetraversal {
    public static void main(String[] args) {
          BST1 b=new BST1();
        Node1 root=null;
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
        b.inorder(root);
      
    }
}
