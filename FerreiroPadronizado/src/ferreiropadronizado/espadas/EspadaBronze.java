package ferreiropadronizado.espadas;

/**
 *
 * @author Gabriel
 */
public class EspadaBronze implements Espada{
    //Atributos:

    
    //==========================================================================
    
    //Métodos:
    
    @Override
    public void Finalizado(){
        System.out.println("Espada de bronze foi forjada!!");
    }
    
    @Override
    public boolean Ataca(){
        return true;
    }
}