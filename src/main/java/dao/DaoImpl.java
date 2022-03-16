package dao;


import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        //Base de données
        System.out.println("Version base de données");
        double temp = Math.random()*Math.sin(Math.PI*Math.random());

        return temp;
    }
}
