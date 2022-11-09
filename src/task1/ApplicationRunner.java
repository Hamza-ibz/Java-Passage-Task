package task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ApplicationRunner {

    public static void main(String[] args) {

        String filepath = System.getProperty("user.dir");

        String dataFile = filepath + File.separator + "datafile.txt";
        String opfile = filepath + File.separator + "results.txt";

        File fileobj = new File(dataFile);

        Scanner input = null;
        PrintWriter pw = null;

        try {
            input = new Scanner(fileobj);
            pw = new PrintWriter(new File(opfile));

            while (input.hasNext()) { // while there is stuff in the file the loop will run.
                String line = input.nextLine().trim(); //input.nextLine().trim() reads line by line
                String[] items = line.split(" "); // creating a string array line by line

                String[] string_array = { "V10", "V11", "V12","C10",
                    "C11", "C12", "C13", "C14", "C15", "C16", "C17", "C18", "C19", "C20", "C21", "C22", "C23", "C24", "C25", "C26", "C27", "C28", "C29", "C30",
                    "C31", "C32", "C33", "C34", "C35", "C36", "C37", "C38", "C39", "C40","V1", "V2", "V3", "V4", "V5", "V6", "V7", "V8", "V9", "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9"};

                String[] letter_array = {"U", "y", "Y","G",
                    "h", "H", "j", "J", "k", "K", "l", "L", "m", "M", "n", "N", "p", "P", "q", "Q",
                    "r", "R", "s", "S", "t", "T", "v", "V", "w", "W", "x", "X", "z", "Z","a", "A", "e", "E", "i", "I", "o", "O", "u",  "b", "B", "c", "C", "d", "D", "f", "F", "g", };
                for (int j = 0; j < items.length; j++) { // iterating through every element in array
                    
                    cv(items[j], string_array,letter_array);
                    System.out.print(cv(items[j], string_array,letter_array)+ " ");
                    
                    pw.print(cv(items[j], string_array,letter_array)+ " ");
                }
                System.out.println();
                    pw.println();
            }

        } catch (FileNotFoundException fnf) {
            System.out.println("where is this file?");
            System.exit(0);

        } finally {
            input.close();
            pw.close();;
        }
    }

    public static String cv(String s, String[] string_array, String[] letter_array) {
        String store = s;

        for (int i = 0; i < string_array.length; i++) {
            String s_store = string_array[i];
            String l_store = letter_array[i];
            if (s.contains(s_store)) {

                String replc = store.replace(s_store, l_store);
                store = replc;
            }
        }
        return store;
    }

}
