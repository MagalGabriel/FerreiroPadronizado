package ferreiropadronizado.forjas;

import ferreiropadronizado.familiaabstrata.Armadura;
import ferreiropadronizado.familiaabstrata.Escudo;
import ferreiropadronizado.familiaabstrata.Espada;
import ferreiropadronizado.familiaferro.ArmaduraFerro;
import ferreiropadronizado.familiaferro.EscudoFerro;
import ferreiropadronizado.familiaferro.EspadaFerro;

/**
 *
 * @author Gabriel
 */

    /*
        Esta classe forja implementa a interface ForjaAbstrata 
        Ela contêm os métodos para criar produtos de uma única
        variedade, no caso "Ferro"
    */

public class ForjaFerro implements ForjaAbstrata {

    @Override
    public Espada forjarEspada() {
        return new EspadaFerro();
    }

    @Override
    public Escudo forjarEscudo() {
        return new EscudoFerro();
    }

    @Override
    public Armadura forjarArmadura() {
        return new ArmaduraFerro();
    }

}
