import java.util.Scanner;

public class App {
    private static Carro carro; // Mova a declaração de carro para fora do método main
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean sair = false;

        while (!sair) {
            menu();
            int opcao = entrada.nextInt();
            entrada.nextLine(); // Consume newline left-over

            switch (opcao) {
                case 1: // Criar o carro
                    System.out.println("Entre com o valor da velocidade inicial: ");
                    int velocidade = Integer.parseInt(entrada.nextLine());

                    System.out.println("Entre com as vezes: ");
                    int vezes = Integer.parseInt(entrada.nextLine());

                    System.out.println("Entre com o nome do carro: ");
                    String nomeCarro = entrada.nextLine();

                    carro = new Carro(velocidade, vezes, nomeCarro);

                    System.out.println("Carro criado com sucesso.");
                    break;
                case 2: // Acelerar o carro
                        int a = carro.acelerar();
                        System.out.println(a);
                    break;
                case 3: // Reduzir a velocidade
                        int d = carro.desacelera();
                        System.out.println(d);
                    break;
                case 4: // Exibir os dados do carro
                        //carro.exibirDados();
                        System.out.println("Carro não foi criado.");
                    break;
                case 5: // Sair
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        System.out.println("Programa encerrado.");
        entrada.close();
    }

    public static void menu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Criar o carro");
        System.out.println("2. Acelerar o carro");
        System.out.println("3. Reduzir a velocidade");
        System.out.println("4. Exibir os dados do carro");
        System.out.println("5. Sair");
    }
}
