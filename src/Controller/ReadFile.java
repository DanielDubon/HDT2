package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static String read(){
        System.out.println("\"C:\\Users\\bianc\\OneDrive\\Documents\\ejem.txt\"");
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
