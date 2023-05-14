package ferreiropadronizado;

import ferreiropadronizado.forjas.ForjaAbstrata;
import ferreiropadronizado.forjas.ForjaAco;
import ferreiropadronizado.forjas.ForjaBronze;
import ferreiropadronizado.forjas.ForjaFerro;
import java.util.Scanner;


public class Run {

    Scanner teclado = new Scanner(System.in);
   
    private static Application configureApplication() {
        Application app;
        ForjaAbstrata forja;
        String material = "Ferro";
    
        
         switch(material){
            case "Ferro": 
            forja = new ForjaFerro();  
           
            case "Aço":
            forja = new ForjaAco();
            
            case "Bronze":
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
