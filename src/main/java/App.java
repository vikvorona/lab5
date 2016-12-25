import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ворона on 26.12.2016.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Printer printer = (Printer) context.getBean("printer");
        printer.print();
    }
}
