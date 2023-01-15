import java.util.Scanner;

public class searchArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int array[] = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
		System.out.println("Enter Number need to search ");
		int searchNum = sc.nextInt();

		int cunter = 0;
		for(int i = 0; i < array.length;i++){

			if(array[i] == searchNum){
				cunter++;

			}
		}
		System.out.println("number repeat "+cunter+" time");

	}

}
