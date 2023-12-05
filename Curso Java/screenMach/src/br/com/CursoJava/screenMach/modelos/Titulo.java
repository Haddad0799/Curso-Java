package br.com.CursoJava.screenMach.modelos;

public class Titulo implements Comparable<Titulo> {
    //Atributos.
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    //getters.
    public int getTotalDeAvaliacoes() {

        return totalDeAvaliacoes;
    }

    public String getNome() {

        return nome;
    }

    public int getAnoLancamento() {

        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {

        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {

        return duracaoEmMinutos;
    }

    //Setters.
    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {

        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {

        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos)
    {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Métodos.
    public void exibeFichaTecnica() {
        if (incluidoNoPlano) {
            System.out.println("Título incluído no plano");
        } else {
            System.out.println("Título não incluído no plano");
        }
        System.out.println("Nome do Título: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + retornaMedia());
        System.out.println("Total de avaliações: " + totalDeAvaliacoes + " avaliações.");
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    public double retornaMedia() {

        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
