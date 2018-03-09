package com.prituladima.web.configuration;

import com.prituladima.web.beens.RarelyUsedBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com.prituladima.web.beens"})
@Import(AppConfiguration.class)
public class LazyConfiguration {

    @Bean
    @Lazy
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public RarelyUsedBean rarelyUsedBean(){
        return new RarelyUsedBean();
    }

}
