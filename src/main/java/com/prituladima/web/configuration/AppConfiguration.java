package com.prituladima.web.configuration;

import com.prituladima.web.arch.Language;
import com.prituladima.web.impl.English;
import com.prituladima.web.impl.Vietnamese;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.prituladima.web.beens"})
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