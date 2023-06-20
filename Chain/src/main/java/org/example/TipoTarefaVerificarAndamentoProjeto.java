package org.example;

public class TipoTarefaVerificarAndamentoProjeto implements TipoTarefa {

    private static TipoTarefaVerificarAndamentoProjeto tipoTarefaVerificarAndamentoProjeto = new TipoTarefaVerificarAndamentoProjeto();

    private TipoTarefaVerificarAndamentoProjeto() {};

    public static TipoTarefaVerificarAndamentoProjeto getTipoTarefaVerificarAndamentoProjeto() {
        return tipoTarefaVerificarAndamentoProjeto;
    }
}
