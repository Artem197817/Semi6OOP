package homeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
//@Component
public class ListReport {


    public List<Report> reportList;


    public ListReport (){;
    }
   // @Autowired
    public void setReportList(List<Report> reportList) {
        this.reportList = reportList;
    }
    public List getReportList() {
        return reportList;
    }
}
