package br.com.CursoJava.screenMach;

import br.com.CursoJava.screenMach.classifica.FiltraRecomendacao;
import br.com.CursoJava.screenMach.modelos.Filme;
import br.com.CursoJava.screenMach.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        Serie serie = new Serie();
        FiltraRecomendacao filtro = new FiltraRecomendacao();

        serie.setNome("Vikings");
        serie.setAtiva(false);
        serie.setTemporadas(6);
        serie.setAnoLancamento(2013);
        serie.setIncluidoNoPlano(true);
        serie.avalia(10);
        serie.avalia(10);
        serie.avalia(10);
        serie.setMinutosPorEpisodios(50);
        serie.setEpisodiosPorTemporada(8);
        serie.exibeFichaTecnica();
        System.out.println("Classificação: " +serie.getClassificacao() + " estrelas");
        filtro.Filtra(serie);


        System.out.println("\n\n");


        filme.setNome("O lobo de wall street");
        filme.setIncluidoNoPlano(true);
        filme.setDiretor("Martin Scorsese");
        filme.setAnoLancamento(2014);
        filme.avalia(10);
        filme.avalia(10);
        filme.avalia(10);
        filme.setDuracaoEmMinutos(180);
        filme.exibeFichaTecnica();
        System.out.println("Classificação: " + filme.getClassificacao() + " estrelas.");
        filtro.Filtra(filme);














    }
}
