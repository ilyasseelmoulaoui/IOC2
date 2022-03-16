package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class PresSpringXml {
    public static void main(String[] args) {
        // creation d'un objet de type ApplicationcContext
        ApplicationContext context=new AnnotationConfigApplicationContext("ext","metier");

        //ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        // La recherche d'un un objet metier
        //IMetier metier= (IMetier) context.getBean("metier");
        IMetier metier=context.getBean(IMetier.class);
        // test
        System.out.println(metier.calcul());
    }
}
