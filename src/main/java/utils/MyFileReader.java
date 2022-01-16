package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class MyFileReader {
    // Fungsi ini untuk membaca file dengan BufferedReader
    // Path sebagai paramater menjadikan fungsi ini reusable
    public static BufferedReader readFile(String fileName) throws FileNotFoundException {
        return new BufferedReader(new java.io.FileReader(fileName));
    }
}
