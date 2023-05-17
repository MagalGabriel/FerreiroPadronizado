package ferreiropadronizado.familiaaco;

import ferreiropadronizado.familiaabstrata.Espada;

/**
 *
 * @author Gabriel
 */
public class EspadaAco implements Espada{
   
      /*
    Cada classe de uma familia tem a mesma variação
    No caso dessa classe ela é uma variação Aço de Espada
    */
    
    //==========================================================================
    
    //Métodos:
    
    @Override
    public void Finalizado(){
        System.out.println("Espada de aço foi forjada!!");
    }
    
   
}
