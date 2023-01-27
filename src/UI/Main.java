package UI;

import Controller.ReadFile;
import Model.PostfizCalculator;
import Model.StackT;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import static Controller.ReadFile.read;

public class Main {
    public static boolean menu = true;
    public static void main(String[] args) throws Exception {
        PostfizCalculator calculator = new PostfizCalculator();
        StackT<Integer> operandos = new StackT<Integer>();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        System.out.println(" -----MENU----");
        System.out.println("1.. Calcular resultado de expresión-->postfix");
        System.out.println("2. Verificar pila");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scan.nextInt();

        switch (opcion) {
            case 1:
                String expresion = ReadFile.read();
                ArrayList<String> items = calculator.getItems(expresion);
                for (String item : items) {
                    if (calculator.isOperator(item)) {
                        int b = (int) operandos.pull();
                        int a = (int) operandos.pull();
                        int resultado = 0;
                        switch (item) {
                            case "+":
                                resultado = calculator.suma(a, b);

                                break;
                            case "-":
                                resultado = calculator.resta(a, b);
                                break;
                            case "*":
                                resultado = calculator.multiplicacion(a, b);
                                break;
                            case "/":
                                resultado = calculator.division(a, b);
                                break;
                        }
                        operandos.push(resultado);
                    } else {
                        operandos.push(Integer.parseInt(item));
                    }
                }
                System.out.println("Resultado: " + operandos.peek());
                break;

            case 2:
                if (calculator.isOneItem(operandos)) {
                    System.out.println("La pila solo tiene un elemento");
                } else {
                    System.out.println("La pila tiene mas de un elemento");
                }
                break;
            case 3:
                exit = true;
                menu = false;
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }
    }


}