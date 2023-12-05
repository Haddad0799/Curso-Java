package br.com.CursoJava.screenMach.principal;

import br.com.CursoJava.screenMach.classifica.FiltraRecomendacao;
import br.com.CursoJava.screenMach.modelos.Filme;
import br.com.CursoJava.screenMach.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme("O lobo de wall street", 2014);

        Serie serie = new Serie("Vikings", 2013);

        FiltraRecomendacao filtro = new FiltraRecomendacao();

        serie.setAtiva(false);
        serie.setTemporadas(6);
        serie.setIncluidoNoPlano(true);
        serie.avalia(10);
        serie.avalia(10);
        serie.avalia(10);
        serie.setMinutosPorEpisodios(50);
        serie.setEpisodiosPorTemporada(8);
        serie.exibeFichaTecnica();
        System.out.println("Classificação: " +serie.getClassificacao() + "  estrelas");
        filtro.Filtra(serie);


        System.out.println("\n\n");

        filme.setIncluidoNoPlano(true);
        filme.setDiretor("Martin Scorsese");
        filme.avalia(10);
        filme.avalia(10);
        filme.avalia(10);
        filme.setDuracaoEmMinutos(180);
        filme.exibeFichaTecnica();
        System.out.println("Classificação: " + filme.getClassificacao() + " estrelas.");
        filtro.Filtra(filme);

        Filme filme1 = new Filme("Até o último Homem", 2016);


        filme1.setIncluidoNoPlano(true);
        filme1.setDiretor("Mel Gibson.");
        filme1.setAnoLancamento(2016);
        filme1.setDuracaoEmMinutos(138);
        filme.avalia(9);
        filme1.avalia(10);
        filme1.avalia(8);
        filme1.exibeFichaTecnica();
        System.out.println("classifacação: " + filme1.getClassificacao() + "estrelas.");
        filtro.Filtra(filme1);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filme);
        listaDeFilmes.add(filme1);

        System.out.println(listaDeFilmes.toString());

        for (int i = 0 ; i < listaDeFilmes.size(); i++) {
            System.out.println(listaDeFilmes.get(i).toString());
        }


















    }
}
