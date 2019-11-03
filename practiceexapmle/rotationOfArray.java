package practiceexapmle;
import java.util.*;


public class rotationOfArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        List l1=new ArrayList<>();
        for(int i=0;i<n;i++){
             l1.add(kb.nextInt());
        }
        int n1=kb.nextInt();
        for(int i=0;i<n1;i++){
             String n2=kb.next();
             kb.nextLine();
            if(n2.equals("insert")==true){
                 int b=kb.nextInt();
                 int b1=kb.nextInt();
                 l1.add(b,b1);
            }
            if(n2.equals("delete")){
                int b3=kb.nextInt();
                  l1.remove(b3);
            }
             
        }
        for(Object j:l1){
            System.out.print(j+" ");
        }
      
    }
}

