
package Data_Structure;


import java.util.Scanner;




public class Queue_FIFO {
    Scanner input=new Scanner(System.in);
    int front,last,capacity;
    int temp;
    int array[];
    public void Capacity(int k){
        capacity=k;
        front=-1;
        last=-1;
        array=new int [this.capacity]; 
    }
    
    public void  Enqueue()
    {
        int en;
        System.out.print("How many input :");       
        en=input.nextInt();
        for (int i = 0; i < en; i++)
        {
            
        if(last==capacity-1)
        {
            System.out.println("Queue Overflow");            
        }
        else if(front==-1 && last==-1)
        {
            front++;
            last++;
            array[last]=input.nextInt();
            
        }
        else{
            last++;
            array[last]=input.nextInt();
            
        }
            
        }
       
    }
    
    public void Dequeue()
    {
        if(front==-1)
        {
            System.out.println("Queue Underflow");              
        }
        else if(front==last){
            temp=array[last];
            front=-1;
            last=-1;
            System.out.println("After Dequeue node data not available");            
        }
        else
        {
          temp=array[front];
          front++;
          
        }
    }
    public void show(){
        if(last==-1){
            System.out.println("Queue Overflow");            
        }
        else
        {
            System.out.println("Queue After one Dequeue\n");            
            for (int i = front; i <= last; i++)
            {
                    System.out.print(array[i]+" | ");       
                    
            }
        }
        System.out.println("");        
    }
    
    public static void main(String[] args) 
    {
        
    Scanner input2=new Scanner(System.in);

    int ch;
    Queue_FIFO queue;
    queue = new Queue_FIFO();
    queue.Capacity(10);
    
menu:
for (int p = 0; p < 100002; p++) 
{
        System.out.println("cls");        

    System.out.println("1. Add");
    System.out.println("2. Remove");
    System.out.println("3. Display");
    System.out.println("4. Quit"); 
    System.out.print("Enter choice :");
    ch=input2.nextInt();
    switch(ch)
    {
        case 1:{
            queue.Enqueue();
            break;}
        case 2:{
            queue.Dequeue();
            break;}
        case 3:{
            queue.show();
            break;}
        
        case 4:
            break menu;
            
    }
    continue menu;
} 
  
    }
   
}
