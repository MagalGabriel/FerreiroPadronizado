package ferreiropadronizado.armaduras;

/**
 *
 * @author Gabriel
 */
public class ArmaduraFerro implements Armadura{
    //Atributos:
    
    
    //==========================================================================
    
    //Métodos:
    
    @Override
    public void Finalizado(){
        System.out.println("Armadura de ferro foi forjada!!");
    }
    
    @Override
    public boolean Defende(){
        return true;
    }
}
