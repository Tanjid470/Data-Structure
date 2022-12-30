
package Data_Structure;
import java.util.Scanner;

class X extends Recursion2
{
   public static int Listt(int m)
   {
       
      if(m==0)
          return 0 ;
      else
          return m+Listt(m-2);
              

   }   
}


public class Recursion2 {
    public static void main(String[] args) {
                X x=new X();
                int result,a;

        Scanner input=new Scanner(System.in);
        System.out.printf("From Where: ");
        int b=input.nextInt();
        if(b%2==0){
             a=b;
             System.out.println(""+a);            
             result = x.Listt(a);
           
        }
        else{
            a=b-1; 
             result = x.Listt(a);
            
        }        
        System.out.println("Summ :"+result);
        
 
        
    }


    
}
