package br.com.CursoJava.screenMach.classifica;

public class FiltraRecomendacao {


        public void Filtra(Classificavel classificavel) {
            if (classificavel.getClassificacao() <= 5 && classificavel.getClassificacao() >= 4)  {
                System.out.println("Está entre os favoritos.");
            } else if (classificavel.getClassificacao() <= 3 && classificavel.getClassificacao() >=2) {
                System.out.println("Filme Recomendado");
            } else  {
                System.out.println("Assistir mais tarde");
            }
        }
    }

