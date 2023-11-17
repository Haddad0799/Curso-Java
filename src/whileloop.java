import java.util.Scanner;

public class whileloop {

    public static void main(String[] args) {
        int notas = 0;
        double nota = 0;
        double notaAcumulada = 0;


        Scanner lerDados = new Scanner(System.in);

        while (nota != -1) {
            System.out.println("digite uma nota ou -1 para sair: ");
            nota = lerDados.nextDouble();
            if (nota != -1) {
                notaAcumulada += nota;
                notas++;
            }

        }
        double media = notaAcumulada / notas;

        System.out.println("a média foi " + media);
    }
}