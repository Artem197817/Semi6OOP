package homeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportPDF implements Report {



    private  Document document;
    public void setDocument(Document document) {
        this.document = document;
    }
@Autowired
    public ReportPDF() {
        //this.document = document;
    }


    @Override
    public String keyReport() {
        return "PDF";
    }

    @Override
    public Report report(Document document) {
        ReportPDF reportPDF = new ReportPDF();
        reportPDF.setDocument(document);
        return reportPDF;
    }

    @Override
    public String toString() {
        return "ReportPDF{" +
                "document=" + document +
                '}';
    }
}
