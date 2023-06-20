package org.example;

public class TipoTarefaCriarLayoutConformeFigma implements TipoTarefa {

    private static TipoTarefaCriarLayoutConformeFigma tipoTarefaCriarLayoutConformeFigma = new TipoTarefaCriarLayoutConformeFigma();

    private TipoTarefaCriarLayoutConformeFigma() {};
    
    public static TipoTarefaCriarLayoutConformeFigma getTipoTarefaCriarLayoutConformeFigma() {
        return tipoTarefaCriarLayoutConformeFigma;
    }

}
