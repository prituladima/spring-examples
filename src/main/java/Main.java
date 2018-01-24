import arch.Language;
import beens.GreetingService;
import beens.MyComponent;
import beens.RarelyUsedBean;
import configuration.AppConfiguration;
import configuration.LazyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main{

    public static void main(String[] args) throws InterruptedException{
        // Creating a Context Application object by reading
        // the configuration of the 'AppConfiguration' class.
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
//
        System.out.println("----------");
        Language language = (Language) context.getBean("getVietnameseLanguage");

        System.out.println("Bean Language: "+ language);
        System.out.println("Call language.sayBye(): "+ language.getBye());

        System.out.println("----------");
//
//        System.out.println("----------");
//        Language language1 = (Language) context.getBean("language-English");
//
//        System.out.println("Bean Language: "+ language1);
//        System.out.println("Call language.sayBye(): "+ language1.getBye());
//
//        System.out.println("----------");
//
//
        GreetingService service = (GreetingService) context.getBean("greetingService");


        service.sayGreeting();
//
        System.out.println("----------");
//
        MyComponent myComponent = (MyComponent) context.getBean("myComponent");

        myComponent.showAppInfo();

        System.out.println("----------");

        ApplicationContext context1 = new AnnotationConfigApplicationContext(LazyConfiguration.class);

        int counter = 0;
        while (++counter < 5){
            Thread.sleep(500);
            RarelyUsedBean rarelyUsedBean = context1.getBean(RarelyUsedBean.class);
            System.out.println(System.identityHashCode(rarelyUsedBean));
        }



    }

}