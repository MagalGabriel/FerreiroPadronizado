package ferreiropadronizado.escudos;

/**
 *
 * @author dti
 */
public class EscudoBronze implements Escudo{
//Atributos:
    
    
    //==========================================================================
    
    //Métodos:
    
   @Override
    public void Finalizado(){
        System.out.println("Escudo de bronze foi forjado!!");
    }
    
    @Override
    public boolean Defende(){
        return true;
    }
        
}
