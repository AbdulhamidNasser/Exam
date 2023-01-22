
public class NextGreater {
	
	
	static void findNextGreater(int arr[], int n)
    {
        int nextGreater;
        for (int i = 0; i < n; i++) {
            nextGreater = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    nextGreater = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " ---> " + nextGreater);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 20, 15, 43, 3 };
        int n = arr.length;
        findNextGreater(arr, n);

	}

}
