package ferreiropadronizado.armaduras;

/**
 *
 * @author Gabriel
 */
public class ArmaduraAco implements Armadura{
    //Atributos:
    
    
    //==========================================================================
    
    //Métodos:
    
    @Override
    public void Finalizado(){
        System.out.println("Armadura de aço foi forjada!!");
    }
    
    @Override
    public boolean Defende(){
        return true;
    }
}
