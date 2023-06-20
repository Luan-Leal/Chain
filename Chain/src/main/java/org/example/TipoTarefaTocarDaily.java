package org.example;

public class TipoTarefaTocarDaily implements TipoTarefa {

    private static TipoTarefaTocarDaily tipoTarefaTocarDaily = new TipoTarefaTocarDaily();

    private TipoTarefaTocarDaily() {};
    
    public static TipoTarefaTocarDaily getTipoTarefaTocarDaily() {
        return tipoTarefaTocarDaily;
    }
}
