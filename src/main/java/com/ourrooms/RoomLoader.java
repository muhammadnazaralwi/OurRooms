package com.ourrooms;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

public class RoomLoader {
    public void load() throws FileNotFoundException {
        Room[] rooms = parse();

        for (int i = 0; i < rooms.length; i++) {
            System.out.println((i+1) + ". " + rooms[i].name);
        }
    }

    private static Room[] parse() throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("room.json"));
        Gson gson = new Gson();

        return gson.fromJson(bufferedReader, Room[].class);
    }
}
