package com.example.projetotcc;

import java.util.Date;

public class Equipamento {
    private int equipamentoId;
    private String marca;
    private String modelo;
    private String especificacoes;
    private String descricao;
    private int precoHora;
    private Date dataRegistro;
    private int tipoId;

    public Equipamento() {
    }

    public Equipamento(int equipamentoId, String marca, String modelo, String especificacoes, String descricao, int precoHora, Date dataRegistro, int tipoId) {
        this.equipamentoId = equipamentoId;
        this.marca = marca;
        this.modelo = modelo;
        this.especificacoes = especificacoes;
        this.descricao = descricao;
        this.precoHora = precoHora;
        this.dataRegistro = dataRegistro;
        this.tipoId = tipoId;
    }

    public int getEquipamentoId() {
        return equipamentoId;
    }

    public void setEquipamentoId(int equipamentoId) {
        this.equipamentoId = equipamentoId;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(int precoHora) {
        this.precoHora = precoHora;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }
}
