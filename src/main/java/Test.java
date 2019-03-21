import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src\\main\\java\\spring-conf.xml");
        Person person =context.getBean(Person.class);
        System.out.println(person);
        System.out.println(context.getBean("aaa"));


//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
//        Person p = ctx.getBean(Person.class);
//        System.out.println(p);
    }
}
