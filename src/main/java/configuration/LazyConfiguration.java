package configuration;

import beens.RarelyUsedBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"beens"})
@Import(AppConfiguration.class)
public class LazyConfiguration {

    @Bean
    @Lazy
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public RarelyUsedBean rarelyUsedBean(){
        return new RarelyUsedBean();
    }

}
