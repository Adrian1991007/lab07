package ro.usv;

import java.io.FileNotFoundException;

/**
 * The Main class is the entry point of the program
 * @author  Gherasim Daniel Adrian
 * @version 1.0
 * @since   17.11.2021
 */

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String FileName = "E:\\Facultate\\ANUL 3\\SEM 1\\SDA\\Laboratoare\\lab07\\cifru.txt";
        String FileName2 = "E:\\Facultate\\ANUL 3\\SEM 1\\SDA\\Laboratoare\\lab07\\cifru2.txt";

//        System.out.println("test - citit");
//        String cifrat = Caesar.Encrypt("test", 23);
//        System.out.println(cifrat);
//        System.out.println(Caesar.Decrypt(cifrat, 23));

        System.out.println("Citire din fisier");
        System.out.println();

        System.out.println(FileOperations.ReadFile(FileName));
        System.out.println();

        System.out.println("Al doilea text");
        System.out.println(FileOperations.ReadFile(FileName2));



    }
}
