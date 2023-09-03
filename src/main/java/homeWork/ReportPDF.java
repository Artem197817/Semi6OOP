package homeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportPDF implements Report {

    public void setDocument(Document document) {
        this.document = document;
    }

    private  Document document;
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
        return new ReportPDF();
    }

    @Override
    public String toString() {
        return "ReportPDF{" +
                "document=" + document +
                '}';
    }
}
