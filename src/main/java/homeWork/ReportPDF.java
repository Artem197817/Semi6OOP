package homeWork;

public class ReportPDF implements Report {

  private final Document document;

    public ReportPDF(Document document) {
        this.document = document;
    }


    @Override
    public String keyReport() {
        return "PDF";
    }

    @Override
    public Report report(Document document) {
        return new ReportPDF(document);
    }

    @Override
    public String toString() {
        return "ReportPDF{" +
                "document=" + document +
                '}';
    }
}
