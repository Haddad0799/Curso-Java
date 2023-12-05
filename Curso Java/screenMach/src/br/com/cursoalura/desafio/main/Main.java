package br.com.cursoalura.desafio.main;

import br.com.cursoalura.desafio.Preferidos;
import br.com.cursoalura.desafio.audios.Musica;
import br.com.cursoalura.desafio.audios.Podcast;

public class Main {
    public static void main(String[] args) {
            Podcast podcast = new Podcast();
            Musica musica = new Musica();
            Preferidos preferido = new Preferidos();

            podcast.setNomePodcast("Hipsters Ponto Tech");
            podcast.setTitulo("TechGuide: Orientação a Objetos - #350");
            podcast.setDuracao(40);
            for (int i = 0; i < 1000; i++) {
                    podcast.reproduzir(true);
            }
            for (int i = 0; i < 500; i++) {
                    podcast.curtir(true);
            }

            System.out.println("Podcast: " + podcast.getNomePodcast());
            System.out.println("Título: " + podcast.getTitulo());
            System.out.println("Classificação: " + podcast.getClassificacao());
            System.out.println("Total reproduções: " + podcast.getTotalReproducoes());
            System.out.println("Curtidas: " + podcast.getCurtidas());
            preferido.incluiPreferido(podcast);

            System.out.println("\n");

            musica.setTitulo("The Hills");
            musica.setNomeArtista("The Weeknd");
            musica.setAlbum("Beauty Behind The Madness");
            musica.setDuracao(4);

            for (long i = 0; i < 2047603754; i++) {
                    musica.reproduzir(true);
            }

            for (int i = 0; i < 12000000; i++) {
                    musica.curtir(true);
            }

            System.out.println("Titulo: " + musica.getTitulo());
            System.out.println("Artista: " + musica.getNomeArtista());
            System.out.println("Album: " + musica.getAlbum());
            System.out.println( "Classificação: " + musica.getClassificacao());
            System.out.println("Total reproduções: " + musica.getTotalReproducoes());
            System.out.println("Curtidas: " + musica.getCurtidas());
            preferido.incluiPreferido(musica);

    }
}
