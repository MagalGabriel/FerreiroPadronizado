package ferreiropadronizado.forjas;

import ferreiropadronizado.familiaabstrata.Armadura;
import ferreiropadronizado.familiaabstrata.Escudo;
import ferreiropadronizado.familiaabstrata.Espada;

/**
 *
 * @author Gabriel
 */

    /*
        Esta é a interface Forja, é a classe em que a classe cliente terá
        conhecimento/acesso

        ela contêm metodos para criar cada um dos produtos abstratos 
    */

public interface ForjaAbstrata {
    
    Espada forjarEspada();
    Escudo forjarEscudo();
    Armadura forjarArmadura();
    
}
