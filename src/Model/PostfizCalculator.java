package Model;

import java.util.ArrayList;

public class PostfizCalculator implements IPostfixCalculator{

    @Override
    public boolean isOneItem(IStack operandos) {
        if (operandos.count()==1) {
            return  true;
        }
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
        ArrayList<String> items = new ArrayList<String>();
        StringBuilder item = new StringBuilder();
        for (int i = 0; i < _expresion.length(); i++) {
            char c = _expresion.charAt(i);
            if (Character.isDigit(c) || c == '.') {
                item.append(c);
            } else {
                if (item.length() > 0) {
                    items.add(item.toString());
                    item.setLength(0);
                }
                items.add(String.valueOf(c));
            }
        }
        if (item.length() > 0) {
            items.add(item.toString());
        }
        return items;
    }
}
