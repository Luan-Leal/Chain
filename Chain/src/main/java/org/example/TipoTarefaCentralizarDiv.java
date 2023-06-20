package org.example;

public class TipoTarefaCentralizarDiv implements TipoTarefa {

    private static TipoTarefaCentralizarDiv tipoTarefaCentralizarDiv = new TipoTarefaCentralizarDiv();

    private TipoTarefaCentralizarDiv() {};
    
    public static TipoTarefaCentralizarDiv getTipoTarefaCentralizarDiv() {
        return tipoTarefaCentralizarDiv;
    }

}
