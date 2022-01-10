package com.ourrooms;

import java.util.UUID;

public class Room {
    UUID id;
    String name;

    public String toString() {
        return "Room [ id: " + id + ", name: " + name + " ]";
    }
}
