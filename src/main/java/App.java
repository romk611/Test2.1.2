import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        System.out.println(bean.equals(bean2));

        HelloWorld beanCat =
                (HelloWorld) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());

        HelloWorld beanCat2 =
                (HelloWorld) applicationContext.getBean("cat");
        System.out.println(beanCat2.getMessage());

        System.out.println(beanCat.equals(beanCat2));
    }
}