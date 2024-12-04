import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    boolean running = true;
        System.out.println("* * * C A L C U L A D O R A * * *");
        while (running) {
            System.out.println("""
                    Digite o número da operação desejada:
                    1 - soma
                    2 - subtração
                    3 - multiplicação
                    4 - divisão
                    5 - exponenciação
                    6 - raiz
                    7 - percentual
                    8 - sair""");
            System.out.print("Opção: ");
            int choice = scanner.nextInt();

            if (choice == 8){
                running = false;
                System.out.println("Calculadora encerrada.");
            }
        }
        System.out.print("Primeiro número: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Segundo número: ");
        double secondNumber = scanner.nextDouble();

        

        scanner.close();
    }
}