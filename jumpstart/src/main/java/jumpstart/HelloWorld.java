package jumpstart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class HelloWorld {

	public static final String DEST = "results/hello_world.pdf";
	
	public static void main(String[] args) throws IOException {

		File f = new File(DEST);
		
		f.getParentFile().mkdirs();
		
		new HelloWorld().createPdf(DEST);

	}

	public void createPdf(String dest) throws IOException {
		//initialize pdf writer
		FileOutputStream fos = new FileOutputStream(dest);
		PdfWriter writer = new PdfWriter(fos);
		
		// initialize pdf doc
		PdfDocument pdf = new PdfDocument(writer);
		
		//initialize document
		Document document = new Document(pdf);
		
		// add paragraph to the doc
		document.add(new Paragraph("Hello World!"));
		
		// close doc
		document.close();
		
	}
}
