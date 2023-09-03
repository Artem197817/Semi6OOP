package homeWork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program {
    public static void main(String[] args) {
        Document  document = new Document("Заявление","Прошу выдать мне премию");

            var context =
                    new AnnotationConfigApplicationContext(
                            ReportConfig.class);
    }

}
