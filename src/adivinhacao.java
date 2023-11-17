import java.util.Random;
import java.util.Scanner;

public class adivinhacao {
    public static void main(String[] args) {
        int tentativas = 5;
        int chute;

        Random random = new Random();
        Scanner lerDados = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(100);

        System.out.println(numeroAleatorio);

        for (int i = 0; i < tentativas; i++) {
            System.out.println("digite um número de entre 0 e 100");
            chute = lerDados.nextInt();
            if(chute >= 0 && chute <= 100 ) {
                if(chute == numeroAleatorio) {
                    System.out.println("Você acertou!");
                    break;
                } else if (chute > numeroAleatorio) {
                    System.out.println("Seu chute foi maior que o número que tenho guardado em memória.");
                } else {
                    System.out.println("Seu chute foi menor que o número que tenho guardado em memória.");
                }
            } else {
                System.out.println("Digite apenas um número entre 0 e 100!");
                i--;
            }
        }
    }
}
