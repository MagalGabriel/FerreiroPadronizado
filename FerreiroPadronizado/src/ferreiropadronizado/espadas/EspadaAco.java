package ferreiropadronizado.espadas;

/**
 *
 * @author Gabriel
 */
public class EspadaAco implements Espada{
    //Atributos:

    
    //==========================================================================
    
    //Métodos:
    
    @Override
    public void Finalizado(){
        System.out.println("Espada de aço foi forjada!!");
    }
    
    @Override
    public boolean Ataca(){
        return true;
    }
}
