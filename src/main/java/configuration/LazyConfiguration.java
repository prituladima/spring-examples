package configuration;

import beens.RarelyUsedBean;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"beens"})
@Import(AppConfiguration.class)
public class LazyConfiguration {

    @Bean
    @Lazy
    public RarelyUsedBean rarelyUsedBean(){
        return new RarelyUsedBean();
    }

}
