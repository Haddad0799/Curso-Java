package br.com.CursoJava.screenMach.modelos;

import br.com.CursoJava.screenMach.classifica.Classificavel;

public class Filme extends Titulo implements Classificavel {
    //Atributos do objeto Filme.
    private String diretor;

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
}


