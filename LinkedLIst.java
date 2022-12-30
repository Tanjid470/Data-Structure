
package Data_Structure;

import java.util.LinkedList;
import java.util.Scanner;



public class LinkedLIst {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> cars=new LinkedList<>();
        LinkedList<String> books=new LinkedList<>();
        
         for (int i = 0; i < 3; i++) {
             String e=input.next();
             books.add(e);
     
         }
         System.out.println(books);         
        
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Volva");
        cars.add("Tesla");
        System.out.println(cars);
        
        cars.addFirst("Tanjid");
        cars.addLast("Amran");
        
        System.out.println(cars);
        
        cars.removeFirst();
        cars.removeLast();
        cars.remove(2);
        System.out.println(cars);
        
        String x = cars.getFirst();
          System.out.println(x);
        
        
    }
    
}
