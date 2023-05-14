package ferreiropadronizado.forjas;

import ferreiropadronizado.familiaabstrata.Armadura;
import ferreiropadronizado.familiaabstrata.Escudo;
import ferreiropadronizado.familiaabstrata.Espada;
import ferreiropadronizado.familiaaco.ArmaduraAco;
import ferreiropadronizado.familiaaco.EscudoAco;
import ferreiropadronizado.familiaaco.EspadaAco;

/**
 *
 * @author Gabriel
 */
public class ForjaAco implements ForjaAbstrata {

    @Override
    public Espada forjarEspada() {
        return new EspadaAco();
    }

    @Override
    public Escudo forjarEscudo() {
        return new EscudoAco();
    }

    @Override
    public Armadura forjarArmadura() {
        return new ArmaduraAco();
    }

}
