package Project4;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String dir = "C:\\Users\\DunnR\\Documents\\Programing\\IB Computer Science\\IBCompSciPortfolio\\src\\Project4\\";

        File myFile = new File(dir+"NotSorted.csv");
        Parser parser = new Parser(myFile);
//        String[] sortedArray = parser.sortAscending();

//        Writer writer = new Writer(dir+"Out Put.csv");
//        writer.writeArrayData(sortedArray);
    }
}
