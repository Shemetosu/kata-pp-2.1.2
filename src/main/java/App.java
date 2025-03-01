import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld helloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorldBean.getMessage());

        Cat catBean = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getMessage());

        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean2.getMessage());

        boolean helloWorldCompare = bean == helloWorldBean;
        boolean catCompare = catBean == catBean2;
        System.out.println(helloWorldCompare);
        System.out.println(catCompare);
    }
}