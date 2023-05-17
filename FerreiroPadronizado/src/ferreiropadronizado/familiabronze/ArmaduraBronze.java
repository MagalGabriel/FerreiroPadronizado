package ferreiropadronizado.familiabronze;

import ferreiropadronizado.familiaabstrata.Armadura;

/**
 *
 * @author Gabriel
 */
public class ArmaduraBronze implements Armadura{
    
    /*
    Cada classe de uma familia tem a mesma variação
    No caso dessa classe ela é uma variação Bronze de Armadura
    */
    
    //==========================================================================
    
    //Métodos:
    
    @Override
    public void Finalizado(){
        System.out.println("Armadura de bronze foi forjada!!");
    }
    
    
}
