package org.example;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Main {
    public static void main(String[] args) {
        JsonObject jo = new JsonObject();
        jo.add("hello", new JsonPrimitive("world"));
        System.out.println(jo);
    }
}