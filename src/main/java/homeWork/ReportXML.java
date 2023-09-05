package homeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportXML implements Report{

    public void setDocument(Document document) {
        this.document = document;
    }

    private  Document document;
    @Autowired
    public ReportXML() {
        //this.document = document;
    }

    @Override
    public String keyReport() {
        return "XML";
    }

    @Override
    public Report report(Document document) {
        ReportXML reportXML =  new ReportXML();
        reportXML.setDocument(document);
        return reportXML;
    }

    @Override
    public String toString() {
        return "ReportXML{" +
                "document=" + document +
                '}';
    }
}
