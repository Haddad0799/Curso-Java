package br.com.CursoJava.screenMach.principal;

import br.com.CursoJava.screenMach.modelos.Filme;
import br.com.CursoJava.screenMach.modelos.Serie;
import br.com.CursoJava.screenMach.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Filme filme0 = new Filme("Quebrando Regras 3", 2015);
        Filme filme1 = new Filme("Barbie", 2023);
        Serie serie0 = new Serie("The Walking Dead" , 2010);
        Serie serie1 = new Serie("Toy Boy", 2018);
        Filme filme2 = new Filme("Openhaimer", 2023);
        Serie serie2 = new Serie("Vikings", 2014);
        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();

        listaDeTitulos.add(filme0);
        filme1.avalia(10);
        filme0.avalia(9);
        listaDeTitulos.add(filme1);
        listaDeTitulos.add(serie1);
        listaDeTitulos.add(serie0);
        listaDeTitulos.add(serie2);
        listaDeTitulos.add(filme2);
        filme2.avalia(10);


        for (Titulo item: listaDeTitulos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println(filme.getClassificacao());
            }
        }

        ArrayList<String>buscaArtista = new ArrayList<>();

        buscaArtista.add("Tom Holland");
        buscaArtista.add("Megan Fox");
        buscaArtista.add("Brad Pitt");
        buscaArtista.add("Denzel Washington");

        Collections.sort(buscaArtista);
        System.out.println(buscaArtista);
        Collections.sort(listaDeTitulos);
        System.out.println("Ordenando por ordem alfabética: " + listaDeTitulos);
        listaDeTitulos.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por Ano de lançamento: " + listaDeTitulos);
    }
}
