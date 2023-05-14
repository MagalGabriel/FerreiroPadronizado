package ferreiropadronizado;

import ferreiropadronizado.familiaabstrata.Armadura;
import ferreiropadronizado.familiaabstrata.Escudo;
import ferreiropadronizado.familiaabstrata.Espada;
import ferreiropadronizado.forjas.ForjaAbstrata;

/**
 *
 * @author Gabriel
 */
public class Application {

    private Espada espada;
    private Escudo escudo;
    private Armadura armadura;

    public Application(ForjaAbstrata forja) {
        espada = forja.forjarEspada();
        escudo = forja.forjarEscudo();
        armadura = forja.forjarArmadura();
    }

    public void Finalizado() {
        espada.Finalizado();
        escudo.Finalizado();
        armadura.Finalizado();
    }

}
