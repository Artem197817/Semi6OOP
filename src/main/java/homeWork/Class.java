package homeWork;

import java.util.List;

public class Class {
    public static void main(String[] args) {
        Document document = new Document("Заявление","Прошу выдать премию");
        ReportEntrypoint reportEntrypoint = new ReportEntrypoint(List.of(new ReportPDF(document),
                new ReportJSON(document),new ReportXML(document)));
        System.out.println(reportEntrypoint.create(document,"PDF"));
        System.out.println(reportEntrypoint.create(document,"XML"));
    }
}
