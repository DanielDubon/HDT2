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


    /**
     * Receives the string from the file and returns an arrayList with splited elements.
     * @param _expresion
     * @return
     */
    @Override
    public ArrayList<String> getItems(String _expresion) {

        //Split implemented and charged into an array.

        ArrayList<String> items = new ArrayList<String>();
        String[] instructions = _expresion.split(" ");
        for (int i = 0;i<instructions.length;i++){
            items.add(instructions[i]);
        }
        return items;
    }
}
