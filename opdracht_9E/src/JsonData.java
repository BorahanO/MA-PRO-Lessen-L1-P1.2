import java.io.File;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.Scanner;

public class JsonData{

    public static void main(String args[]) {

        // generate JSON String in Java
        writeJson();

        // let's read
        //readJson("book.json");
    }
    /*
     * Java Method to read JSON From File
     */
    @SuppressWarnings("rawtypes")
    public static void readJson(String file) {
        JSONParser parser = new JSONParser();

        try {
            System.out.println("Reading JSON file from Java program");
            FileReader fileReader = new FileReader(file);
            JSONObject json = (JSONObject) parser.parse(fileReader);

            String title = (String) json.get("title");
            String author = (String) json.get("author");
            long price = (long) json.get("price");

            System.out.println("title: " + title);
            System.out.println("author: " + author);
            System.out.println("price: " + price);

            JSONArray characters = (JSONArray) json.get("characters");
            Iterator i = characters.iterator();

            System.out.println("characters: ");
            while (i.hasNext()) {
                System.out.println(" " + i.next());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /*
     * Java Method to write JSON String to file
     */
    public static void writeJson() {

        JSONObject main = new JSONObject();
        JSONArray dialog = new JSONArray();

        dialog.add("TOM: test");
        dialog.add("You: Test");
        main.put("", dialog);

        try {
            System.out.println("Writting JSON into file ...");
            System.out.println(main);
            FileWriter jsonFileWriter = new FileWriter("gamefiles/soundData.json");
            jsonFileWriter.write(main.toJSONString());
            jsonFileWriter.flush();
            jsonFileWriter.close();
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
