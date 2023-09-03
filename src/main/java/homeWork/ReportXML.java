package homeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class ReportXML implements Report{

    private final Document document;
    @Autowired
    public ReportXML(Document document) {
        this.document = document;
    }

    @Override
    public String keyReport() {
        return "XML";
    }

    @Override
    public Report report(Document document) {
        return new ReportXML(document);
    }

    @Override
    public String toString() {
        return "ReportXML{" +
                "document=" + document +
                '}';
    }
}
