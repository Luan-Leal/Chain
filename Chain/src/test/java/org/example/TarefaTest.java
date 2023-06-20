package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TarefaTest {

    ProgramadorSenior senior;
    ProgramadorPleno pleno;
    ProgramadorJunior junior;
    ProgramadorEstagiario estagiario;

    @BeforeEach
    void setUp() {
        senior = new ProgramadorSenior(null);
        pleno = new ProgramadorPleno(pleno);
        junior = new ProgramadorJunior(junior);
        estagiario = new ProgramadorEstagiario(estagiario);
    }

    @Test
    void deveRetornarEstagiarioParaFazerSuaTarefa() {
        assertEquals("Estágiario", estagiario.pegarTarefa(new Tarefa(TipoTarefaCentralizarDiv.getTipoTarefaCentralizarDiv())));
    }

    @Test
    void deveRetornarProgramadorJuniorParaFazerSuaTarefa() {
        assertEquals("Programador Junior", estagiario.pegarTarefa(new Tarefa(TipoTarefaCriarLayoutConformeFigma.getTipoTarefaCriarLayoutConformeFigma())));
    }

    @Test
    void deveRetornarProgramadorPlenoParaFazerSuaTarefa() {
        assertEquals("Programador Pleno", estagiario.pegarTarefa(new Tarefa(TipoTarefaVerificarAndamentoProjeto.getTipoTarefaVerificarAndamentoProjeto())));
    }

    @Test
    void deveRetornarProgramadorSeniorParaFazerSuaTarefa() {
        assertEquals("Programador Senior", estagiario.pegarTarefa(new Tarefa(TipoTarefaValidarLayout.getTipoTarefaValidarLayout())));
    }

    @Test
    void deveRetornarSemTarefa() {
        assertEquals("Sem tarefa", estagiario.pegarTarefa(new Tarefa(TipoTarefaTocarDaily.getTipoTarefaTocarDaily())));
    }

}