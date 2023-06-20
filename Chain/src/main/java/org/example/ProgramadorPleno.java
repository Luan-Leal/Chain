package org.example;

public class ProgramadorPleno extends Programador {

    public ProgramadorPleno(Programador superior) {
        listaTarefa.add(TipoTarefaValidarLayout.getTipoTarefaValidarLayout());
        setProgramadorSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Programador Pleno";
    }

}
