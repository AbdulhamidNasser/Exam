import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fNum;
		int sNum;
		//boolean opt1 = true;
		//boolean opt2 = true;
		
		while(true) {
			System.out.println("Please Enter Firest number : ");
			fNum = sc.nextInt();
			if(fNum >= 0 && fNum <=100) {
				break;
			}
			System.out.println("Wronge Number");
		}
		
		while(true) {
			System.out.println("Please Enter Second Number : ");
			sNum = sc.nextInt();
			if(sNum >= 0 && sNum <=100) {
				break;
			}
			System.out.println("Wronge Number");
			
		}
		
		System.out.println("Your Firest number is : " + fNum);
		System.out.println("Your Second number is : " + sNum);
		
		/*
		int doneFNum;
		int doneSNum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Firest number : ");
		int fNum = sc.nextInt();
		
		
		if(fNum >= 0 && fNum <=100) {
			doneFNum = fNum;
		}
		else {
			System.out.println("Wronge Number");
			System.out.println("Please Enter Firest number Ageing : ");
			fNum = sc.nextInt();
			doneFNum = fNum;
		}
		
		System.out.println("Please Enter Second Number : ");
		int sNum = sc.nextInt();
		
		if(sNum >= 0 && sNum <=100) {
			doneSNum = sNum;
		}
		else {
			System.out.println("Wronge Number");
			System.out.println("Please Enter Second number Ageing : ");
			sNum = sc.nextInt();
			doneSNum = sNum;
		}
		
		System.out.println("Your Firest number is : " + doneFNum);
		System.out.println("Your Second number is : " + doneSNum);
		*/
		
	}

}
