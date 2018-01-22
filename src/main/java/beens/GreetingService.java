package beens;

import arch.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    private Language getVietnameseLanguage;

    @Autowired
    private Language getEnglishLanguage;


    public void sayGreeting() {

        String greeting = getVietnameseLanguage.getGreeting() + " + " +  getEnglishLanguage.getGreeting();

        System.out.println("Greeting: " + greeting);
    }

}