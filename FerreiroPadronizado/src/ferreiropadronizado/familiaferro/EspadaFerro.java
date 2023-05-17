package ferreiropadronizado.familiaferro;

import ferreiropadronizado.familiaabstrata.Espada;

/**
 *
 * @author Gabriel
 */
public class EspadaFerro implements Espada{
    
    /*
    Cada classe de uma familia tem a mesma variação
    No caso dessa classe ela é uma variação Ferro de Espada
    */
    
    //==========================================================================
    
    //Métodos:
    
    @Override
    public void Finalizado(){
        System.out.println("Espada de ferro foi forjada!!");
    }
    
    
}