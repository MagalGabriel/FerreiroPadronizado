package ferreiropadronizado;

import ferreiropadronizado.forjas.ForjaAbstrata;
import ferreiropadronizado.forjas.ForjaAco;
import ferreiropadronizado.forjas.ForjaBronze;
import ferreiropadronizado.forjas.ForjaFerro;


public class FerreiroPadronizado {


public static void main(String[] args) {
        Application app;
        ForjaAbstrata factory;
        String material = "Bronze";

        if (material.contains("Ferro")) {
            factory = new ForjaFerro();

        } else if (material.contains("Aço")) {
            factory = new ForjaAco();
            
        } else {
            factory = new ForjaBronze();
        }
        
        app = new Application(factory);
        
        
        
        app.Finalizado();
    }
}
