package ferreiropadronizado.familiaaco;

import ferreiropadronizado.familiaabstrata.Escudo;

/**
 *
 * @author dti
 */
public class EscudoAco implements Escudo{

      /*
    Cada classe de uma familia tem a mesma variação
    No caso dessa classe ela é uma variação Aço de Escudo
    */
    
    //==========================================================================
    
    //Métodos:
    
   @Override
    public void Finalizado(){
        System.out.println("Escudo de aço foi forjado!!");
    }
    
    
        
}