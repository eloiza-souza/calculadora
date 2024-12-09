import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    final static int END = OperationType.values().length+1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        double firstNumber,
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
                System.out.print("Segundo número: ");
                secondNumber = scanner.nextDouble();
            }

            System.out.print("\nResultado = ");

            OperationType selectedOperation = OperationType.values()[choice - 1];

            switch (selectedOperation) {
                case SUM:
                    System.out.println(Calculator.sum(firstNumber, secondNumber));
                    break;
                case SUBTRACT:
                    System.out.println(Calculator.subtract(firstNumber, secondNumber));
                    break;
                case MULTIPLY:
                    System.out.println(Calculator.multiply(firstNumber, secondNumber));
                    break;
                case DIVIDE:
                    System.out.println(Calculator.divide(firstNumber, secondNumber));
                    break;
                case POW:
                    System.out.println(Calculator.pow(firstNumber, secondNumber));
                    break;
                case ROOT:
                    System.out.println(Calculator.root(firstNumber, secondNumber));
                    break;
                case PERCENTUAL:
                    System.out.println(Calculator.percentual(firstNumber, secondNumber));
                    break;
                case LOG10:
                    System.out.println(Calculator.log10(firstNumber));
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        System.out.println(" ");
        scanner.close();
    }

    public static void showMenu(){
        System.out.println("\nDigite o número da opção desejada:");
                for (OperationType type: OperationType.values()){
                    System.out.println(type.ordinal()+ 1 + " - " + type.getDescription());

                }
        System.out.println(END + " - " + "Sair");

        System.out.print("Opção: ");
    }
}
