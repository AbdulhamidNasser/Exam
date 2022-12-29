import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ExamNew {

	public static void main(String[] args) {
		try {
			for(int i=0; i<=99; i++) {		
			Document document = new Document();
			PdfWriter.getInstance(document,new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\ExamNew\\src\\pdfFile"+i+".pdf"));
			document.open();
			document.add(new Paragraph("Example"));
			document.close();
			}
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("pdf created");

	}

}
