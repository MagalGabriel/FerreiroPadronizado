package ferreiropadronizado.forjas;

import ferreiropadronizado.familiaabstrata.Espada;
import ferreiropadronizado.familiabronze.EspadaBronze;

import ferreiropadronizado.familiaabstrata.Escudo;
import ferreiropadronizado.familiabronze.EscudoBronze;

import ferreiropadronizado.familiaabstrata.Armadura;
import ferreiropadronizado.familiabronze.ArmaduraBronze;

/**
 *
 * @author Gabriel
 */

    /*
        Esta classe forja implementa a interface ForjaAbstrata 
        Ela contêm os métodos para criar produtos de uma única
        variedade, no caso "Bronze"
    */

public class ForjaBronze implements ForjaAbstrata{

    
    @Override
    public Espada forjarEspada() {
        return new EspadaBronze();
    }

    @Override
    public Escudo forjarEscudo() {
        return new EscudoBronze();
    }

    @Override
    public Armadura forjarArmadura() {
        return new ArmaduraBronze();
    }

}
