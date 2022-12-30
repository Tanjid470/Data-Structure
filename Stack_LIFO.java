
package Data_Structure;

import java.util.Scanner;
import java.io.*;
import java.util.Stack;

public class Stack_LIFO {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Stack<Integer> roll = new Stack<Integer>();
        int n;
        menu:
               
    for (int loop = 0; loop < 100; loop++) {
                
        
        System.out.println("1. Push Operation");        
        System.out.println("2. Pop Operation");        
        System.out.println("3. Display"); 
        System.out.println("4. Peek Operation"); 
        System.out.println("5. Insert");
        System.out.println("6. Exit");
        System.out.print("Choose a Option :"); 
               
        n=input.nextInt();
        switch(n){
            
            case 1:
            {
                int p;
               
                System.out.print("How many data you want push :");  
                p=input.nextInt();
                outer:
                for (int i = 0; i < p; i++) 
                {
                int push;
                push=input.nextInt();
                push=roll.push(push); 
                }
                break;        
            }
            case 2:
            {   
                if(roll.empty()){
                    System.out.println("Stack Is Empty");                    
                }
                else{                
                roll.pop();
                }
                break;
            }
            case 3:
            {
                System.out.println(roll);
                break;                
            }
            case 4:
            {
                roll.peek();
                
            }
            case 5:{
              roll.set(2,34);
              
              
              break;
            }
            case 6:
                break menu;
            
        }
        
        continue menu;
    }  
                
        
        
  }
    
}
