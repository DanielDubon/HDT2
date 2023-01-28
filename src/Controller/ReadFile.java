package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Controller class to read files and handle exceptions
 */

public class ReadFile {

    /**
     * Reads the file and return the line in string format.
     * @return
     */
    public static String read(){
        System.out.println("Ingresar la ruta del archivo abajo\n========================================\n");
        Scanner in = new Scanner(System.in);
        String fpath = in.nextLine();

        //User must regists the complete path of txt in order make it work
        //Sample: D:\JOSUE\UVG\Clases Tercer Semestre\DSA\HT2 - Postfix\HDT2\src\ejem.txt

        try {
            File myObj = new File(fpath);
            Scanner myReader = new Scanner(myObj);
            String data="";
            while (myReader.hasNextLine()) {
                data =data + myReader.nextLine();

            }
            myReader.close();
            System.out.println(data);
            return data;

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    return "";
    }
}
