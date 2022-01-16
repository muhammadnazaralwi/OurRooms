package utils;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Parser {
    public <T> T[] parse(Class<T[]> tClass, String path) throws FileNotFoundException {
        Gson gson = new Gson();
        BufferedReader roomJson = MyFileReader.readFile(path);

        return gson.fromJson(roomJson, tClass);
    }
}
