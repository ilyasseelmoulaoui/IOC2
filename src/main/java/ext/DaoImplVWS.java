package ext;

import dao.IDao;
import org.springframework.stereotype.Component;


public class DaoImplVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        double temp = 10*Math.random();
        return temp;
    }
}
