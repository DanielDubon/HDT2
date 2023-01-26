package UI;

import Controller.ReadFile;
import Model.PostfizCalculator;

import java.util.Stack;

import static Controller.ReadFile.read;

/**
 * THIS IS A TEST:)
 */
public class TesterClass {

    public static void main(String[] args) {

        Stack calStack = new Stack(); //Stack de prueba

        PostfizCalculator calculator = new PostfizCalculator();

        String postFixString = read();
        System.out.println(postFixString);

        String[] instructions = postFixString.split(" ");

        for(String instruction:instructions){
            System.out.println(instruction);

            try{
                //aca mete los numeros al stack
                Integer numero = Integer.parseInt(instruction);
                calStack.push(numero);

            }
                 catch(Exception e ){
                    //Entra a la exception si no es un numero

                     System.out.println("Might be an operand...");
                     if (calculator.isOperator(instruction)){ //Verifica que sea un operand
                         if (instruction.equals("+")){
                             //sumamos xD
                             Integer operandoA = (Integer) calStack.pop();
                             System.out.println(calStack);
                             Integer operandoB = (Integer) calStack.pop();
                             System.out.println(calStack);

                             calStack.push(operandoA+operandoB);
                             System.out.println(calStack);
                         }

                         if(instruction.equals("*")){
                             System.out.println("MULTIPLICANDO XD");
                             Integer operandoA = (Integer) calStack.pop();
                             System.out.println(calStack);
                             Integer operandoB = (Integer) calStack.pop();
                             System.out.println(calStack);
                             calStack.push(operandoA*operandoB);
                             System.out.println(calStack);
                         }

                         if (instruction.equals("-")){
                             //sumamos xD
                             Integer operandoA = (Integer) calStack.pop();
                             System.out.println(calStack);
                             Integer operandoB = (Integer) calStack.pop();
                             System.out.println(calStack);

                             calStack.push(operandoA-operandoB);
                             System.out.println(calStack);
                         }

                         if(instruction.equals("/")){
                             System.out.println("DIVIDIENDO XD");
                             Integer operandoA = (Integer) calStack.pop();
                             System.out.println(calStack);
                             Integer operandoB = (Integer) calStack.pop();
                             System.out.println(calStack);
                             calStack.push(operandoA/operandoB);
                             System.out.println(calStack);
                         }
                         //Hacer un vector que coja todos los numero del stack en curso.



                     }


                     }
            }

        }

}
