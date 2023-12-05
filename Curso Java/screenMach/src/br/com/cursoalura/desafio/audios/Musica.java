package br.com.cursoalura.desafio.audios;

public class Musica extends Audio  {
        private String nomeArtista;
        private String album;

    public String getNomeArtista() {
        return nomeArtista;
    }

    public String getAlbum() {
        return album;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public void setAlbum(String album) {
        this.album = album;
    }


    public int getClassificacao()
    {
        if (this.getTotalReproducoes() >= 100000) {
            return 5;
        } else if (this.getTotalReproducoes() < 100000 && this.getTotalReproducoes() >= 50000) {
            return 4;
        } else if (this.getTotalReproducoes() < 50000 && this.getTotalReproducoes() >= 30000) {
            return 3;
        } else if (this.getTotalReproducoes() < 30000 && this.getTotalReproducoes() >= 20000) {
            return 2;
        } else {
            return 1;
        }

    }



}
