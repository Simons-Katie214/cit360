/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
/**
 *
 * @author ksimons
 */
public class JsonRead {
 public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("test"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            String band = (String) jsonObject.get("Band Name");
            System.out.println(band);
            
            String company = (String) jsonObject.get("Company Name");
            System.out.println(company);

            long years = (Long) jsonObject.get("Years Debuted");
            System.out.println(years);

            // loop array
            JSONArray msg = (JSONArray) jsonObject.get("messages");
            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
   
}
