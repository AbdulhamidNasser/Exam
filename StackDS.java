import java.util.Scanner;
import java.util.Stack;

public class StackDS {
	
	int top = -1;
	int arrSize = 5;
	Scanner sc = new Scanner(System.in);
	
	int[] arr = new int[arrSize];
	
	 void push (Scanner sc) {
		System.out.println("Enter Value");  
        int val = sc.nextInt();  
        top++;  
        arr[top]=val;  
        System.out.println("Item pushed");  
          
	}
	
	 void pop () {
		top --;   
        System.out.println("Item popped");  
        
	}
	
	 void display()  
    {  
        System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(arr[i]);  
        }  
        
    }
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		int choice=0;
		
		while(choice != 4)  
	    {  
	        System.out.println("\nChose your options...\n");  
	        System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");  
	        System.out.println("\n Enter your choice \n");        
	        choice = sc.nextInt();  
	        switch(choice)  
	        {  
	            case 1:  
	            {   
	                s.push(sc);  
	                break;  
	            }  
	            case 2:  
	            {  
	                s.pop();  
	                break;  
	            }  
	            case 3:  
	            {  
	                s.display();  
	                break;  
	            }  
	            case 4:   
	            {  
	                System.out.println("Exiting....");  
	                System.exit(0);  
	                break;   
	            }  
	            default:  
	            {  
	                System.out.println("Please Enter valid choice ");  
	            }   
	        };  
	    }  
		
		 

		 
	}
	

}
