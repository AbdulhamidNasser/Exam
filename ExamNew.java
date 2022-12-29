import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ExamNew {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Document document = new Document();
		try {
			for(int i=0; i<=99; i++) {		
			
			PdfWriter.getInstance(document,new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\ExamNew\\src\\pdfFile"+i+".pdf"));
			document.open();
			document.add(new Paragraph("Example"));
			document.close();
			}
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("pdf created");
		
		System.out.println("Enter word need to search :");
    	String serachWord = sc.next(); 
    	int counter = 0;
    	try {
    		File file = new File("C:\\Users\\Lenovo\\eclipse-workspace\\ExamNew\\src\\pdfFile0.pdf");
    		
    		Scanner ns = new Scanner(file);
    		while (ns.hasNext()) {
    			
    			String[] content = ns.nextLine().split("-");
    			
    			for(int i = 0; i < content.length; i++) {
    				
    				if(serachWord.equalsIgnoreCase(content[i])) {
    					counter++;
    					System.out.println(" the word : " + content[i]);
    				}
    			}
    			
    		}
    		System.out.println("this word search is in the file :"+counter);
    		ns.close();
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	}

	}

}
