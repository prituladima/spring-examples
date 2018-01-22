package beens;

import arch.IRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class SuperRepository implements IRepository {

    public String getAppName() {
        return "Super caw";
    }

    public Date getSystemDateTime() {
        return new Date();
    }
}
