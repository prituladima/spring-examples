package beens;

import arch.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    @Value("${propertyOne}")
    private String propertyOne;
    @Value("${propertyTwo}")
    private String propertyTwo;

    @Autowired
    @Qualifier("super")
    private IRepository repository;

    public void showAppInfo() {
        System.out.println("Now is: " + repository.getSystemDateTime());
        System.out.println("App Name: " + repository.getAppName());
        System.out.println(propertyOne);
        System.out.println(propertyTwo);
    }

}
