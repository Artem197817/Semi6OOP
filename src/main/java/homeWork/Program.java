package homeWork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Program {
    public static void main(String[] args) {
        Document  document = new Document("Заявление","Прошу выдать мне премию");
            var context =  new AnnotationConfigApplicationContext(ReportConfig.class);
        var reportEntrypoint = context.getBean(ReportEntrypoint.class);
        System.out.println(  reportEntrypoint.create(document,"PDF"));
         System.out.println(  reportEntrypoint.create(document,"XML"));
          System.out.println(  reportEntrypoint.create(document,"JSON"));
    }

}
