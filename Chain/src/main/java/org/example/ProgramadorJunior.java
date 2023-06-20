package org.example;

public class ProgramadorJunior extends Programador {
    
    public ProgramadorJunior(Programador superior) {
        listaTarefa.add(TipoTarefaCriarLayoutConformeFigma.getTipoTarefaCriarLayoutConformeFigma());
        setProgramadorSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Programador Junior";
    }
}
