package com.example.projetotcc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private int cpf;
    private int cpfDig;
    private String nome;
    private int telefone;
    private int celular;
    private Date dataRegistro;
    private int usuarioIDd;
    private int endId;

    public Cliente() {
    }

    public Cliente(int cpf, int cpfDig, String nome, int telefone, int celular, Date dataRegistro, int usuarioIDd, int endId) {
        this.cpf = cpf;
        this.cpfDig = cpfDig;
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.dataRegistro = dataRegistro;
        this.usuarioIDd = usuarioIDd;
        this.endId = endId;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCpfDig() {
        return cpfDig;
    }

    public void setCpfDig(int cpfDig) {
        this.cpfDig = cpfDig;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public int getUsuarioIDd() {
        return usuarioIDd;
    }

    public void setUsuarioIDd(int usuarioIDd) {
        this.usuarioIDd = usuarioIDd;
    }

    public int getEndId() {
        return endId;
    }

    public void setEndId(int endId) {
        this.endId = endId;
    }
}
