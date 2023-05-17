package ferreiropadronizado.familiabronze;

import ferreiropadronizado.familiaabstrata.Espada;

/**
 *
 * @author Gabriel
 */
public class EspadaBronze implements Espada{
    
    /*
    Cada classe de uma familia tem a mesma variação
    No caso dessa classe ela é uma variação Bronze de Espada
    */
    
    //==========================================================================
    
    //Métodos:
    
    @Override
    public void Finalizado(){
        System.out.println("Espada de bronze foi forjada!!");
    }
    
    
}