package ferreiropadronizado.forjas;

import ferreiropadronizado.familiaabstrata.Armadura;
import ferreiropadronizado.familiaabstrata.Escudo;
import ferreiropadronizado.familiaabstrata.Espada;

/**
 *
 * @author Gabriel
 */
public interface ForjaAbstrata {
    
    Espada forjarEspada();
    Escudo forjarEscudo();
    Armadura forjarArmadura();
    
}
