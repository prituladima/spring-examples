package beens;

import arch.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    @Value("${propertyOne}")
    private String propertyOne;
    @Value("${propertyTwo}")
    private String propertyTwo;

    @Autowired
    private IRepository superRepository;

    public void showAppInfo() {
        System.out.println("Now is: " + superRepository.getSystemDateTime());
        System.out.println("App Name: " + superRepository.getAppName());
        System.out.println(propertyOne);
        System.out.println(propertyTwo);
    }

}
