package homeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//@Component
public class ReportJSON implements Report {

    private final Document document;
    @Autowired
    public ReportJSON(Document document) {
        this.document = document;
    }

    @Override
    public String keyReport() {
        return "JSON";
    }

    @Override
    public Report report(Document document) {
        return new ReportJSON(document);
    }

    @Override
    public String toString() {
        return "ReportJSON{" +
                "document=" + document +
                '}';
    }
}
