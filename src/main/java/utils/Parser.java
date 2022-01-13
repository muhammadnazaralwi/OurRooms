package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;

public class Parser<T> {
    public T[] parse(String path) throws FileNotFoundException {
        Gson gson = new Gson();
        Type typeOfT = new TypeToken<T>(){}.getType();
        BufferedReader roomJson = MyFileReader.readFile(path);

        return gson.fromJson(roomJson, typeOfT);
    }
}
