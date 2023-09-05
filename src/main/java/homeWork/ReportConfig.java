package homeWork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "homeWork")
public class ReportConfig {
    @Bean
    public ListReport listReport() {
        List<Report> reportList = new ArrayList<>();
        reportList.add(new ReportPDF());
        reportList.add(new ReportXML());
        reportList.add(new ReportJSON());
        ListReport listReport = new ListReport();
        listReport.setReportList(reportList);
        return listReport;
    }
}
