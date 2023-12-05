package br.com.CursoJava.screenMach.modelos;

import br.com.CursoJava.screenMach.classifica.Classificavel;

public class Filme extends Titulo implements Classificavel {
    //Atributos do objeto Filme.
    private String diretor;

    public Filme(String nome , int anoLancamento) {
        super(nome, anoLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Duração em minutos: "  + getDuracaoEmMinutos() + " minutos.");
        System.out.println("Diretor: " + diretor);
    }

    @Override
    public int getClassificacao()
    {
        return (int) retornaMedia() / 2;
    }

    @Override
    public String toString() {

        return "Filme: " + this.getNome()  + " (" + this.getAnoLancamento() + ")";
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return super.compareTo(outroTitulo);
    }
}




