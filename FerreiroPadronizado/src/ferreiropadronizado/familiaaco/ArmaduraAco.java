package ferreiropadronizado.familiaaco;

import ferreiropadronizado.familiaabstrata.Armadura;

/**
 *
 * @author Gabriel
 */
public class ArmaduraAco implements Armadura{
    
    /*
    Cada classe de uma familia tem a mesma variação
    No caso dessa classe ela é uma variação Aço de Armadura
    */
    
    //==========================================================================
    
    //Métodos:
    
    @Override
    public void Finalizado(){
        System.out.println("Armadura de aço foi forjada!!");
    }
    
    
}
