import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainSerialization {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdSerialization SerializeObj = new StdSerialization();
		 try{ 
		Scanner sc = new Scanner(System.in);
		FileOutputStream file = new FileOutputStream("stdFile.txt");    
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		System.out.println("Enter Student Name: ");
		SerializeObj.name = sc.next();
		System.out.println("Enter ID Name: ");
		SerializeObj.id = sc.nextInt();
		System.out.println("Enter Age Name: ");
		SerializeObj.age = sc.nextInt();
		
		out.writeObject(SerializeObj);
		out.close();
        file.close();
         
        System.out.println("Your Object has been serialized");


		  
		 }catch(Exception e){
			 System.out.println(e);
			 } 
		 
		 try{ 
		 FileInputStream file = new FileInputStream("stdFile.txt");
         ObjectInputStream in = new ObjectInputStream(file);
         StdSerialization s = (StdSerialization)in.readObject();
         in.close();
         file.close();
         
         System.out.println("Your Object has been deserialized");
         System.out.println("Student Name: " + s.name);
         System.out.println("Student ID: " + s.id);
         System.out.println("Student Age: " + s.age);

		
		  }catch(Exception e){
			  System.out.println(e);
			  } 

	}

}
