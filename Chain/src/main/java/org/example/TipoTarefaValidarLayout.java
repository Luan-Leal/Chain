package org.example;

public class TipoTarefaValidarLayout implements TipoTarefa {

    private static TipoTarefaValidarLayout tipoTarefaValidarLayout = new TipoTarefaValidarLayout();

    private TipoTarefaValidarLayout() {};

    public static TipoTarefaValidarLayout getTipoTarefaValidarLayout() {
        return tipoTarefaValidarLayout;
    }
}
