package configuration;

import arch.Language;
import impl.English;
import impl.Vietnamese;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"beens"})
@PropertySource("application.properties")
public class AppConfiguration {

    @Bean
    @Qualifier("vietnamese")
    public Language getVietnameseLanguage() {
        return new Vietnamese();
    }

    @Bean
    @Qualifier("english")
    public Language getEnglishLanguage() {
        return new English();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}