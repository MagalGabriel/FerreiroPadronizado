package ferreiropadronizado.familiaferro;

import ferreiropadronizado.familiaabstrata.Armadura;

/**
 *
 * @author Gabriel
 */
public class ArmaduraFerro implements Armadura{
    
    /*
    Cada classe de uma familia tem a mesma variação
    No caso dessa classe ela é uma variação Ferro de Armadura
    */
    
    //==========================================================================
    
    //Métodos:
    
    @Override
    public void Finalizado(){
        System.out.println("Armadura de ferro foi forjada!!");
    }
    
    
}
