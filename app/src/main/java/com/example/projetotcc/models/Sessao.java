package com.example.projetotcc.models;

import java.sql.Time;

public class Sessao {
    private int sessaoId;
    private int vendaId;
    private Time sessaoHorarioInicio;
    private int endId;
    private int cliId;
    private String descricao;
    private int fotografoCpf;
    private Time sessaoHorarioFim;

    public Sessao() {

    }

    public Sessao(int sessaoId, int vendaId, Time sessaoHorarioInicio, int endId, int cliId, String descricao, int fotografoCpf, Time sessaoHorarioFim) {
        this.sessaoId = sessaoId;
        this.vendaId = vendaId;
        this.sessaoHorarioInicio = sessaoHorarioInicio;
        this.endId = endId;
        this.cliId = cliId;
        this.descricao = descricao;
        this.fotografoCpf = fotografoCpf;
        this.sessaoHorarioFim = sessaoHorarioFim;
    }

    public int getSessaoId() {
        return sessaoId;
    }

    public void setSessaoId(int sessaoId) {
        this.sessaoId = sessaoId;
    }

    public int getVendaId() {
        return vendaId;
    }

    public void setVendaId(int vendaId) {
        this.vendaId = vendaId;
    }

    public Time getSessaoHorarioInicio() {
        return sessaoHorarioInicio;
    }

    public void setSessaoHorarioInicio(Time sessaoHorarioInicio) {
        this.sessaoHorarioInicio = sessaoHorarioInicio;
    }

    public int getEndId() {
        return endId;
    }

    public void setEndId(int endId) {
        this.endId = endId;
    }

    public int getCliId() {
        return cliId;
    }

    public void setCliId(int cliId) {
        this.cliId = cliId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getFotografoCpf() {
        return fotografoCpf;
    }

    public void setFotografoCpf(int fotografoCpf) {
        this.fotografoCpf = fotografoCpf;
    }

    public Time getSessaoHorarioFim() {
        return sessaoHorarioFim;
    }

    public void setSessaoHorarioFim(Time sessaoHorarioFim) {
        this.sessaoHorarioFim = sessaoHorarioFim;
    }
}
