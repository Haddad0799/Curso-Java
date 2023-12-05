public class condicional {
    public static void main(String[] args) {

        int dia = 1;

        String diaDasemana = "";

        switch (dia) {
            case 1:
                diaDasemana = "domingo";
                break;

            case 2:
                diaDasemana = "segunda";
                break;

            case 3:
                diaDasemana = "terça";
                break;

            case 4:
                diaDasemana = "quarta";
                break;

            case 5:
                diaDasemana = "quinta";
                break;

            case 6:
                diaDasemana = "sexta";
                break;

            case 7:
                diaDasemana = "sabado";
                break;
        }

        System.out.println("Hoje é " + diaDasemana);

    }
}
