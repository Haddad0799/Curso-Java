package br.com.CursoJava.screenMach.modelos;

import br.com.CursoJava.screenMach.classifica.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodios;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return minutosPorEpisodios * episodiosPorTemporada * temporadas;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Numero de temporadas: " + temporadas + " Temporadas." );
        System.out.println("Episódos por temporada: " + episodiosPorTemporada + " episódios.");
        System.out.println("Minutos por episódios: " + minutosPorEpisodios + " minutos.");
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos() + " minutos.");
        if (isAtiva()) {
            System.out.println("Em breve novos episódios.");
        } else {
            System.out.println("Série não possui novos episódios.");
        }
    }
    
    @Override
    public int getClassificacao() {
        return (int) retornaMedia() / 2;
    }
}
