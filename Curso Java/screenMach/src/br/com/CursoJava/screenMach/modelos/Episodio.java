package br.com.CursoJava.screenMach.modelos;

import br.com.CursoJava.screenMach.classifica.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;

    private Serie serie;

    private int totaslVizualizacoes;

    public int getTotaslVizualizacoes() {
        return totaslVizualizacoes;
    }

    public void setTotaslVizualizacoes(int totaslVizualizacoes) {
        this.totaslVizualizacoes = totaslVizualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getClassificacao() {
        if (totaslVizualizacoes >= 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
