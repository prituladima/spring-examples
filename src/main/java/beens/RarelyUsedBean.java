package beens;

import org.springframework.beans.factory.InitializingBean;

public class RarelyUsedBean implements InitializingBean{

    public void afterPropertiesSet() throws Exception {
        System.out.println("RarelyUsedBean - START");
    }
}
