package beens;

import arch.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    @Qualifier("english")
    private Language language1;

    @Autowired
    @Qualifier("vietnamese")
    private Language language2;


    public void sayGreeting() {

        String greeting = language1.getGreeting() + " + " +  language2.getGreeting();

        System.out.println("Greeting: " + greeting);
    }

}