
public class LargerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,22,5};
		
		 int large = arr[0];
		 
		 for (int i = 0; i < arr.length; i++) {  
	            
	           if(arr[i] > large)  
	        	   large = arr[i];  
	        }  
	        System.out.println("Largest number in array: " + large);  
		

	}

}
