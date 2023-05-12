package ferreiropadronizado.espadas;

/**
 *
 * @author Gabriel
 */
public class EspadaFerro implements Espada{
    //Atributos:

    
    //==========================================================================
    
    //Métodos:
    
    @Override
    public void Finalizado(){
        System.out.println("Espada de ferro foi forjada!!");
    }
    
    @Override
    public boolean Ataca(){
        return true;
    }
}