package homeWork;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReportEntrypoint {
    private final Map <String , Report> reportMap;

    public ReportEntrypoint(List<Report> reportList) {
       reportMap = reportList.stream()
               .collect(Collectors.toMap(Report::keyReport, Function.identity()));
    }
    public Report create(Document document , String reportType){
        Report report = reportMap.get(reportType);
        if (reportType != null)
            return report.report(document);
        throw new UnsupportedOperationException("Operation " + reportType + " is unsupported");

    }
}
