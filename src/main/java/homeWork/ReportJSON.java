package homeWork;

public class ReportJSON implements Report {

    private final Document document;

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
