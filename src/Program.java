import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        final int END = 9;
        double firstNumber = 0,
                secondNumber = 0;
        System.out.println("* * * C A L C U L A D O R A * * *");

        while (running) {
            showMenu();
            int choice = scanner.nextInt();
            if(choice < 1 || choice > END){
                System.out.println("Opção inválida, tente novamente.");
                continue;
            }
            if (choice == END) {
                running = false;
                System.out.println("\nCalculadora encerrada.");
                continue;
            }

            System.out.print("\nPrimeiro número: ");
            firstNumber = scanner.nextDouble();

            if (choice <= 7) {
                System.out.print("\nSegundo número: ");
                secondNumber = scanner.nextDouble();
            }

            switch (choice) {
                case 1:
                    System.out.println("\nResultado = " + Calculator.sum(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.println("\nResultado = " + Calculator.subtract(firstNumber, secondNumber));
                    break;
                case 3:
                    System.out.println("\nResultado = " + Calculator.multiply(firstNumber, secondNumber));
                    break;
                case 4:
                    System.out.println("\nResultado = " + Calculator.divide(firstNumber, secondNumber));
                    break;
                case 5:
                    System.out.println("\nResultado = " + Calculator.pow(firstNumber, secondNumber));
                    break;
                case 6:
                    System.out.println("\nResultado = " + Calculator.root(firstNumber, secondNumber));
                    break;
                case 7:
                    System.out.println("\nResultado = " + Calculator.percentual(firstNumber, secondNumber));
                    break;
                case 8:
                    System.out.println("\nResultado = " + Calculator.log10(firstNumber));
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        scanner.close();
    }

    public static void showMenu(){
        System.out.println("""
                    
                    Digite o número da opção desejada:
                    1 - somar
                    2 - subtrair
                    3 - multiplicar
                    4 - dividir
                    5 - elevar a um expoente
                    6 - raiz n-ésima
                    7 - percentual
                    8 - log base 10
                    9 - sair""");

        System.out.print("Opção: ");
    }
}