package Project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
    public Scanner scanner;
    int numValues=13;
    public String[] unsortedValues = new String[numValues];

    public Parser(File file) {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("file was not found");
            e.printStackTrace();
        }
        readDataIntoArray();
    }

    public void readDataIntoArray(){
        for (int i = 0; i < numValues; i++) {
            unsortedValues[i]=scanner.next();
            System.out.println(unsortedValues[i].toString());
        }
    }

    public String[] sortAscending(){

        BubbleSorter bs = new BubbleSorter();
        return bs.sort(unsortedValues);

    }

}
