
public class ThirdHighest {
	
	static void FindsThirdHighest(int arr[], int arr_size) {
		int i;
		int first;
		int second;
		int third;
		third = first = second = Integer.MIN_VALUE;
		for ( i = 0; i < arr_size; i++) {
            
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
 
            
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
 
            else if (arr[i] > third)
                third = arr[i];
        }
 
        System.out.println("The Third Highes Elements Are "+ third);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        FindsThirdHighest(arr, n);

	}

}
