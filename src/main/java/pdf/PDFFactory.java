package pdf;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfWriter;
import model.Company;
import service.DataService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

/**
 * Created by RENT on 2017-03-16.
 */
public class PDFFactory {

    private Company company;

    public void createPDF() {
        Properties properties = DataService.loadProperties();
        String pdfPath = properties.getProperty("pdfPath");
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdfPath + File.separator + "file.pdf")); //file separator - domyslny separator w SOUT
            document.open();
            document.add(new Paragraph("Hello World")); //Paragraf do PDF
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //nowa metoda, na wejściu company, na wyjściu PDF
    /**
     *
     */
    public  static void pdfFromCompany(Company company){
        Properties properties = DataService.loadProperties();
        String pdfPath = properties.getProperty("pdfPath");
        DataService dataService = new DataService();
        List<String> list = dataService.printCompanyInfo(company);
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdfPath + File.separator + "file.pdf")); //file separator - domyslny separator w SOUT
            document.setPageSize(new Rectangle(180,240));
            document.open();
            for (String e: list) {
                document.add(new Paragraph(e)); //Paragraf do PDF
            }
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
