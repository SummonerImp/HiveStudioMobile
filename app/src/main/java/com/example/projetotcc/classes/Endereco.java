package com.example.projetotcc.classes;

public class Endereco {
    private int enderecoId;
    private int cidadeId;
    private String logradouro;
    private String numero;
    private String complemento;

    public Endereco() {
    }

    public Endereco(int enderecoId, int cidadeId, String logradouro, String numero, String complemento) {
        this.enderecoId = enderecoId;
        this.cidadeId = cidadeId;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public int getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(int enderecoId) {
        this.enderecoId = enderecoId;
    }

    public int getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(int cidadeId) {
        this.cidadeId = cidadeId;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
