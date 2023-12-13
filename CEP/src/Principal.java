
import java.io.IOException;
import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {

        Scanner lerCep = new Scanner(System.in);;
        ConsultaCep consultaCep = new ConsultaCep();
        String cep;

        System.out.println("Digite o cep que deseja procurar: ");
        cep = lerCep.nextLine();

        try {
            Endereco endereco = consultaCep.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();

            gerador.SalvaJson(endereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando consulta.");
        }





    }

}
