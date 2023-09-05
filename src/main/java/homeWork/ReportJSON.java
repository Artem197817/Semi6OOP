package homeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ReportJSON implements Report {

    private  Document document;

    public void setDocument(Document document) {
        this.document = document;
    }

    @Autowired
    public ReportJSON() {
       // this.document = document;
    }

    @Override
    public String keyReport() {
        return "JSON";
    }

    @Override
    public Report report(Document document) {
        ReportJSON reportJSON = new ReportJSON();
        reportJSON.setDocument(document);
        return reportJSON;
    }

    @Override
    public String toString() {
        return "ReportJSON{" +
                "document=" + document +
                '}';
    }
}
