package beens;

import arch.IRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class MyRepository implements IRepository{

    public String getAppName() {
        return "Hello Spring App";
    }

    public Date getSystemDateTime() {
        return new Date();
    }


}
