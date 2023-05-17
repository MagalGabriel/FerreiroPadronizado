package ferreiropadronizado;

import ferreiropadronizado.forjas.ForjaAbstrata;
import ferreiropadronizado.forjas.ForjaAco;
import ferreiropadronizado.forjas.ForjaBronze;
import ferreiropadronizado.forjas.ForjaFerro;


public class FerreiroPadronizado {

    /*
        Esta classe executa o código, ela vai definir qual familia vai ser
        instânciada, através de um certo contexto ou condições.
    */
    
 private static Application configureApplication() {
       
         Application app;
        ForjaAbstrata forja;
        String material = "Ferro";

        if (material.contains("Ferro")) {
            forja = new ForjaFerro();

        } else if (material.contains("Aço")) {
            forja = new ForjaAco();
            
        } else {
            forja = new ForjaBronze();
        }
         app = new Application(forja);
        return app;
 }
    
        public static void main(String[] args) {
       
        
         Application app = configureApplication();
        
        app.Finalizado();
    }
}
