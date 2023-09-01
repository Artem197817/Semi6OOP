package homeWork;

public class ReportXML implements Report{

    private final Document document;

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
