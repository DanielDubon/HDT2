package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static String ReadFile(){
        System.out.println("Ingrese la ruta del archivo ej C:\\ejemplos\\example1.txt");
        Scanner in = new Scanner(System.in);
        String fpath = in.nextLine();

        try {
            File myObj = new File(fpath);
            Scanner myReader = new Scanner(myObj);
            String data="";
            while (myReader.hasNextLine()) {
                data =data + myReader.nextLine();

            }
            myReader.close();
            return data;

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    return "";
    }
}
