
public class Garbage {
	
	
	public void finalize()
	{
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Garbage firestObj=new Garbage();
		Garbage secondObj=new Garbage();
		firestObj=null;
		secondObj=null;
		  System.gc();

	}

}
