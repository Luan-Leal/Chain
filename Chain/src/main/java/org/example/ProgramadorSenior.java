package org.example;

public class ProgramadorSenior extends Programador {

    public ProgramadorSenior(Programador superior) {
        listaTarefa.add(TipoTarefaVerificarAndamentoProjeto.getTipoTarefaVerificarAndamentoProjeto());
        setProgramadorSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Programador Senior";
    }

}
