package br.com.cursoalura.desafio.audios;

public class Audio {
    //atributos do objeto audio.
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

    //getters.

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    // Setters.

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void reproduzir(boolean reproduziu) {
        if (reproduziu) {
            totalReproducoes++;
        }
    }

    public void curtir(boolean curtiu) {
        if(curtiu) {
            curtidas++;
        }
    }

}
