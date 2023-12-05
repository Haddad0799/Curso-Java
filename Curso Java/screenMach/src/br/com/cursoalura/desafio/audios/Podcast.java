package br.com.cursoalura.desafio.audios;

public class Podcast extends Audio  {
    private String nomePodcast;

    public String getNomePodcast() {
        return nomePodcast;
    }

    public void setNomePodcast(String nomePodcast) {
        this.nomePodcast = nomePodcast;
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() >= 1000) {
            return 5;
        } else if (this.getCurtidas() < 1000 && this.getCurtidas() >= 600) {
            return 4;
        } else if (this.getCurtidas() < 600 && this.getCurtidas() >= 400) {
            return 3;
        } else if (this.getCurtidas() < 400 && this.getCurtidas() >= 200) {
            return 2;
        } else {
            return 1;
        }

    }


}
