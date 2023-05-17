package ferreiropadronizado.familiaferro;

import ferreiropadronizado.familiaabstrata.Escudo;

/**
 *
 * @author dti
 */
public class EscudoFerro implements Escudo{

    /*
    Cada classe de uma familia tem a mesma variação
    No caso dessa classe ela é uma variação Ferro de Escudo
    */
    
    //==========================================================================
    
    //Métodos:
    
   @Override
    public void Finalizado(){
        System.out.println("Escudo de ferro foi forjado!!");
    }
    
    
        
}
