package pres;

import ext.DaoImpl2;
import dao.DaoImpl;
import ext.DaoImplVWS;
import metier.MetierImpl;

public class Presentation {
     public static void main(String[] args){
         /*
         Injection des dependances par
         instanciation startique => new
          */
         DaoImplVWS dao = new DaoImplVWS();
         MetierImpl metier = new MetierImpl();
         metier.setDao(dao);
         System.out.println("Resultat: "+metier.calcul());
     }
}
