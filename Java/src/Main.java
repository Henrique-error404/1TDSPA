import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

   //variaveis();
        //operadores();

        var calculo = 1 + 2 - (3 * 2) / 5.0;
        System.out.println(calculo);
        calculo++;
        System.out.println(calculo);
        calculo--;
        System.out.println(calculo);

        //condicionais();
        var scanner = new Scanner(System.in);
        System.out.println("Digite a idade");
        var idade = scanner.nextInt();
        scanner.nextLine();


        if(idade >= 18 && idade <= 200)
            System.out.println("A pessoa é meior de idade");
        else if(idade > 200)
            System.out.println("Achamos um fossil");
            else
            System.out.println("A pessoa é menor de idade");


    }
        public static void variaveis(){
            System.out.println("Sistema iniciando...");

            var scan = new Scanner(System.in);
            System.out.println("digite o numero 1: ");
            var numero1 = scan.nextBigDecimal();
            scan.nextLine();
            System.out.println("digite o numero 2: ");
            var numero2 = scan.nextBigDecimal();
            scan.nextLine();

            System.out.println(numero1.add(numero2));

            String nome = "Fiap";
            System.out.println(nome);

            int numero = 10;
            System.out.println(numero + 10);

            double valor = 10.5;
            System.out.println(numero + 10.5);

            long valorGrande = 10000000000L;
            short valorPequeno = 10;

            char letra = 'A';
            boolean condicao = true;

            var temp = 30.5;
            System.out.println(" A temp é de: " + temp + "graus");


            var numeroTexto = "10";
            // convercao explicita de string para int
            var numeroCovertido = Integer.parseInt(numeroTexto);

            //declaracao de variaveis
            int idade;
            //inicializacao de variaveis
            idade = 10;
            idade = 20;
            idade = 30;
            //declaracao e inicializacao
            var idade2 = 10;



            System.out.println("Sistema finalizado...");

        }
}
