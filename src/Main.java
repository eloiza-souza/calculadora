import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("* * * C A L C U L A D O R A * * *");

        while (running) {
            System.out.println("""
                    
                    Digite o número da opção desejada:
                    1 - somar
                    2 - subtrair
                    3 - multiplicar
                    4 - dividir
                    5 - elevar a um expoente
                    6 - raiz n-ésima
                    7 - percentual
                    8 - sair""");

            System.out.print("Opção: ");
            int choice = scanner.nextInt();
            if(choice < 1 || choice > 8){
                System.out.println("Opção inválida, tente novamente.");
                continue;
            }
            if (choice == 8) {
                running = false;
                System.out.println("\nCalculadora encerrada.");
                continue;
            }

            System.out.print("\nPrimeiro número: ");
            double firstNumber = scanner.nextDouble();

            System.out.print("\nSegundo número: ");
            double secondNumber = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("\nResultado = " + (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.println("\nResultado = " + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println("\nResultado = " + (firstNumber * secondNumber));
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Não é permitido divisão por zero. Tente novamente");
                    } else {
                        System.out.println("\nResultado = " + (firstNumber / secondNumber));
                    }
                    break;
                case 5:
                    System.out.println("\nResultado = " + Math.pow(firstNumber, secondNumber));
                    break;
                case 6:
                    System.out.println("\nResultado = " + Math.pow(firstNumber, 1/secondNumber));
                    break;
                case 7:
                    System.out.println("\nResultado = " + (firstNumber * secondNumber / 100));
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        }
        scanner.close();
    }
}