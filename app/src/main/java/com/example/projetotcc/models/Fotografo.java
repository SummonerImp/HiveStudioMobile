package com.example.projetotcc.models;

import java.util.Date;

public class Fotografo {
    private int fotografoCpf;
    private String nome;
    private char celular;
    private char telefone;
    private int endId;
    private Date dataRegistro;
    private boolean isAtivo;
    private int pgtoHora;
    private int usuarioId;
    private int cpfDig;

    public Fotografo() {
    }

    public Fotografo(int fotografoCpf, String nome, char celular, char telefone, int endId, Date dataRegistro, boolean isAtivo, int pgtoHora, int usuarioId, int cpfDig) {
        this.fotografoCpf = fotografoCpf;
        this.nome = nome;
        this.celular = celular;
        this.telefone = telefone;
        this.endId = endId;
        this.dataRegistro = dataRegistro;
        this.isAtivo = isAtivo;
        this.pgtoHora = pgtoHora;
        this.usuarioId = usuarioId;
        this.cpfDig = cpfDig;
    }

    public int getFotografoCpf() {
        return fotografoCpf;
    }

    public void setFotografoCpf(int fotografoCpf) {
        this.fotografoCpf = fotografoCpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getCelular() {
        return celular;
    }

    public void setCelular(char celular) {
        this.celular = celular;
    }

    public char getTelefone() {
        return telefone;
    }

    public void setTelefone(char telefone) {
        this.telefone = telefone;
    }

    public int getEndId() {
        return endId;
    }

    public void setEndId(int endId) {
        this.endId = endId;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public boolean isAtivo() {
        return isAtivo;
    }

    public void setAtivo(boolean ativo) {
        isAtivo = ativo;
    }

    public int getPgtoHora() {
        return pgtoHora;
    }

    public void setPgtoHora(int pgtoHora) {
        this.pgtoHora = pgtoHora;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getCpfDig() {
        return cpfDig;
    }

    public void setCpfDig(int cpfDig) {
        this.cpfDig = cpfDig;
    }
}
