package homeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//@Component
public class ReportEntrypoint {
    private final Map <String , Report> reportMap;

    @Autowired
    public ReportEntrypoint(ListReport listReport) {
        reportMap = (Map<String, Report>) listReport.getReportList().stream()
               .collect(Collectors.toMap(Report::keyReport, Function.identity()));
    }
    public Report create(Document document , String reportType){
        Report report = reportMap.get(reportType);
        if (reportType != null)
            return report.report(document);
        throw new UnsupportedOperationException("Operation " + reportType + " is unsupported");

    }
}
