package ferreiropadronizado.familiabronze;

import ferreiropadronizado.familiaabstrata.Escudo;

/**
 *
 * @author dti
 */
public class EscudoBronze implements Escudo{

    /*
    Cada classe de uma familia tem a mesma variação
    No caso dessa classe ela é uma variação Bronze de Escudo
    */
    
    //==========================================================================
    
    //Métodos:
    
   @Override
    public void Finalizado(){
        System.out.println("Escudo de bronze foi forjado!!");
    }
    
    
        
}
