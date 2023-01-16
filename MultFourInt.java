
public class MultFourInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1, 2, 3, 4, 5, 6};
		int a=maxProd(num);
		System.out.println("the max prodect : "+a);

	}
	
	public static int maxProd(int[]num) {
		int total =1;
		for(int i = 2; i < num.length;i++) {
			 total=num[i]*total;
			 
		}
		return total;
	}

}
