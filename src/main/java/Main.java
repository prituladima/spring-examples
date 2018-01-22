import beens.GreetingService;
import beens.MyComponent;
import configuration.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main{

    public static void main(String[] args) {
        // Creating a Context Application object by reading
        // the configuration of the 'AppConfiguration' class.
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
//
//        System.out.println("----------");
//        Language language = (Language) context.getBean("language-Vietnamese");
//
//        System.out.println("Bean Language: "+ language);
//        System.out.println("Call language.sayBye(): "+ language.getBye());
//
//        System.out.println("----------");
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

    }

}