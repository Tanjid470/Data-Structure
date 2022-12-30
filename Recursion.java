
package Data_Structure;

import java.util.Scanner;


public class Recursion {
            public static int rec(int n)
            {          
                  if(n==1)
                  {
                         return 1;
                  }
                  else
                  {
                     return n+rec(n-1);
                  }

            }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Positive Number :");
        int x=input.nextInt();
                int result=rec(x);
                System.out.println("Sum is = "+result);             
        }

}
