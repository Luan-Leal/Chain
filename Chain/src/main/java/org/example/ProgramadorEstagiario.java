package org.example;

public class ProgramadorEstagiario extends Programador {
    
    public ProgramadorEstagiario(Programador superior) {
        listaTarefa.add(TipoTarefaCentralizarDiv.getTipoTarefaCentralizarDiv());
        setProgramadorSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Estágiario";
    }

}
