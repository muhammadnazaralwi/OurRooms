package utils;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Parser {
    // Fungsi untuk mengurai json dengan library Gson
    // Dengan attribute class dan path sebagai paramater
    // Sehingga fungsi ini reusable
    public <T> T[] parse(Class<T[]> tClass, String path) throws FileNotFoundException {
        Gson gson = new Gson();
        BufferedReader roomJson = MyFileReader.readFile(path);

        return gson.fromJson(roomJson, tClass);
    }
}
