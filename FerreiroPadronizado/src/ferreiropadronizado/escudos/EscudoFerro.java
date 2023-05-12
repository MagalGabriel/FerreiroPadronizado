package ferreiropadronizado.escudos;

/**
 *
 * @author dti
 */
public class EscudoFerro implements Escudo{
//Atributos:
    
    
    //==========================================================================
    
    //Métodos:
    
   @Override
    public void Finalizado(){
        System.out.println("Escudo de ferro foi forjado!!");
    }
    
    @Override
    public boolean Defende(){
        return true;
    }
        
}
