package Model;

import java.util.ArrayList;

public class PostfizCalculator implements IPostfixCalculator{

    @Override
    public boolean isOneItem(IStack operandos) {
       return false;
    }

    @Override
    public int suma(int a, int b) {
        return a+b;
    }

    @Override
    public int resta(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a*b;
    }

    @Override
    public int division(int a, int b) {
        return a/b;
    }

    @Override
    public boolean isOperator(String item) {
        if (item.equals("*")||item.equals("+")||item.equals("-")||item.equals("/")){
            return true;
        }
         return false;
        }



    @Override
    public ArrayList<String> getItems(String _expresion) {
        return null;
    }
}
