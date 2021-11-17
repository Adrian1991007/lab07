package ro.usv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The FileReader class read the encrypted text from the file.
 * decoded it, and returned it
 * @author  Gherasim Daniel Adrian
 * @version 1.0
 * @since   17.11.2021
 */

public class FileOperations {
    public static String ReadFile(String FileName) throws FileNotFoundException {
        File file = new File(FileName);
        int index = FileName.indexOf('.');
        PrintWriter printWriter = new PrintWriter(new File(FileName.substring(0, index)) + "_out.txt");
        Scanner scanner = new Scanner(file);
        String line;
        StringBuilder stringBuilder = new StringBuilder();

        while(scanner.hasNextLine())
        {

            line = scanner.nextLine();
            String[] Result = line.split(" ");

            for (int i = 1; i <= 26; i++)
            {
                for (String str : Result) {

                    stringBuilder.append(Caesar.Decrypt(str.trim(), i)).append(" ");
                }
                stringBuilder.append("\n");
                stringBuilder.append("\n");
            }
            stringBuilder.append("\n");
            stringBuilder.append("\n");
        }
        scanner.close();
        printWriter.println(stringBuilder);
        printWriter.close();

        return stringBuilder.toString();
    }
}
