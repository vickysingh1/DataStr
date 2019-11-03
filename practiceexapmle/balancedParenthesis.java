/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexapmle;

import java.util.*;


/**
 *
 * @author vicky
 */
public class balancedParenthesis {
//    public static void main(String[] args) {
//       Scanner kb=new Scanner(System.in);
//        ArrayList open=new ArrayList<>();
//       ArrayList close=new ArrayList<>();
//       ArrayList stack=new ArrayList<>();
//       open.add("[");
//       open.add("{");
//       open.add("(");
//       close.add("]");
//       close.add("}");
//       close.add(")");
//        System.out.println(open+"\n"+close);
//       String s=kb.next();
//        System.out.println(s);
//       kb.nextLine();
//       if((char)s.charAt(0)==(close.get(0))){
//           System.out.println("yeyes");
//           
//       }
//       int pos;
//       
//      
//        System.out.println(close.indexOf(s.charAt(1)));
//       for(int i=0;i<s.length();i++){
//           if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
//               stack.add(s.charAt(i));
//               System.out.println("openopen...");
//       }
//           else if(s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')'){
//               pos=close.indexOf(s.charAt(i));
//               System.out.println(pos);
//               System.out.println("closeclose...");
//               
//           
//        if(stack.size()>0 && open.get(pos)==stack.get(stack.size()-1)){
//            stack.remove(stack.size()-1);
//        }
//        else{
//          
//            break;
//        }
//       
//         
//           }
//      
//        
//       }
//             if(stack.isEmpty()==true){
//            System.out.println("Balanced");
//            
//          
//       }else{
//                 System.out.println("unblanced");
//             }
//      
//       
//    }
//    
//    
//       
//}


public static void main(String []argh)
{
    Scanner sc = new Scanner(System.in);

        boolean valid = true;
        String input=sc.next();
        Stack<String> st = new Stack<String>();
        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[' ){
                st.push(String.valueOf(input.charAt(i)));
            }
            else{
                try{
                    String para = st.pop();
                    if(input.charAt(i) == '}'){
                        if(!(para.equals("{"))){
                            valid = false;
                            break;
                        }
                        if(input.charAt(i) == ')'){
                            if(!(para.equals("("))){
                                valid = false;
                                break;
                            }
                        }
                        if(input.charAt(i) == ']'){
                            if(!(para.equals("["))){
                                valid = false;
                                break;
                            }
                        }

                    }
                }catch(Exception e){
                    valid = false;
                }
            }
        }
        if(valid && st.isEmpty()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }        
    

}
}