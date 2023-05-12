package ferreiropadronizado.armaduras;

/**
 *
 * @author Gabriel
 */
public class ArmaduraBronze implements Armadura{
    //Atributos:
    
    
    //==========================================================================
    
    //Métodos:
    
    @Override
    public void Finalizado(){
        System.out.println("Armadura de bronze foi forjada!!");
    }
    
    @Override
    public boolean Defende(){
        return true;
    }
}
