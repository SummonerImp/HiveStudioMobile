package com.example.projetotcc.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fotografo implements Serializable {
    private int fotografoCpf;
    private String nome;
    private int celular;
    private int telefone;
    private int endId;
    private Date dataRegistro;
    private boolean isAtivo;
    private int pgtoHora;
    private int usuarioId;
    private int cpfDig;
    private double nota;
    private int tempoXp;

    public Fotografo() {
    }

    public Fotografo(int fotografoCpf, String nome, int celular, int telefone, int endId, Date dataRegistro, boolean isAtivo, int pgtoHora, int usuarioId, int cpfDig) {
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getTempoXp() {
        return tempoXp;
    }

    public void setTempoXp(int tempoXp) {
        this.tempoXp = tempoXp;
    }

    public List<Fotografo> selectAll(){
        List<Fotografo> fotoData  = new ArrayList<>();
        return fotoData;
    }

    public void insert(Fotografo data){
        //db.insert();
    }

    @Override
    public String toString() {
        return nome;
    }
}
