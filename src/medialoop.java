import java.util.Scanner;

public class medialoop {

    public static void main(String[] args) {

        Scanner lerDados = new Scanner(System.in);

        int notas = 5;

        double nota;
        double totalNotas = 0;

        for (int i = 0; i < notas; i++) {
            System.out.println("digite sua nota");
            nota = lerDados.nextDouble();
            totalNotas += nota;
        }
        double media = totalNotas / notas;

        System.out.println(media);

    }
}
