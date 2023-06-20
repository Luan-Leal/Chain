package org.example;

import java.util.ArrayList;

public abstract class Programador {

    protected ArrayList listaTarefa = new ArrayList();
    private Programador programadorSuperior;

    public Programador getFuncionarioSuperior() {
        return programadorSuperior;
    }

    public void setProgramadorSuperior(Programador programadorSuperior) {
        this.programadorSuperior = programadorSuperior;
    }
    
    public abstract String getDescricaoCargo();
    
    public String pegarTarefa(Tarefa tarefa) {
        if (listaTarefa.contains(tarefa.getTipoTarefa())) {
            return getDescricaoCargo();
        }
        else {
            if (programadorSuperior != null) {
                return programadorSuperior.pegarTarefa(tarefa);
            }
            else 
            {
                return "Sem tarefa";
            }
        }        
    }
}
