package ferreiropadronizado.escudos;

/**
 *
 * @author dti
 */
public class EscudoAco implements Escudo{
//Atributos:
    
    
    //==========================================================================
    
    //Métodos:
    
   @Override
    public void Finalizado(){
        System.out.println("Escudo de aço foi forjado!!");
    }
    
    @Override
    public boolean Defende(){
        return true;
    }
        
}