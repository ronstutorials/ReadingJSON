package com.readjson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingJSON {

    public static void main(String[] args){

        String first = "/Users/temp/Documents/BobFile.json";

        try {
            String contents = new String((Files.readAllBytes(Paths.get(first))));
            JSONObject o = new JSONObject(contents);
            JSONArray emails = o.getJSONArray("emails");
            for (int i = 0; i < emails.length(); i++) {
                System.out.println(emails.getString(i));
            }
            JSONObject family = new JSONObject("family");
            System.out.println(family.getString("spouse"));
        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
